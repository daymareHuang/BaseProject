import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.Scanner;

public class PeopleTest {

  protected People people = new People();
  protected Scanner scanner = new Scanner(System.in);


  @Test
  public void testSetPeople() {
    people.setPeople();
    
    String name;
    name = scanner.nextLine();
    
    String finalTarget;
    finalTarget = scanner.nextLine();
    
    
    String[] target = new String[3];
    for (int i = 0; i < target.length; i++) {
      System.out.println("階段目標" + (i + 1) + ":");
      target[i] = scanner.nextLine();
    }
    
    int[] testtime = new int[3];
    for (int i = 0; i < testtime.length; i++) {
      System.out.println("完成時間" + (i + 1) + ":");
      testtime[i] = scanner.nextInt();
    }
    
    assertEquals(name, people.getName());
    assertEquals(finalTarget, people.getfinalTarget());
    for (int i = 0; i < testtime.length; i++) {
      assertEquals(testtime[i], people.getTime()[i]);
    }
    
    for (int i = 0; i < target.length; i++) {
      assertEquals(target[i], people.getsegTarget()[i]);
    }
    
  }


  @Test
  public void testGetName() {
    String name;
    name = scanner.nextLine();
    try {
      people.setName();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertEquals(name, people.getName());
  }

  @Test
  public void testSetName() {

    String name;
    name = scanner.nextLine();
    try {
      people.setName();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      people.setName();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertEquals(name, people.getName());

  }

  @Test
  public void testGetfinalTarget() {
    String finalTarget;
    finalTarget = scanner.nextLine();
    people.setfinalTarget();
    assertEquals(finalTarget, people.getfinalTarget());
  }

  @Test
  public void testSetfinalTarget() {
    String finalTarget;
    finalTarget = scanner.nextLine();
    people.setfinalTarget();
    assertEquals(finalTarget, people.getfinalTarget());
  }

  @Test
  public void testGetTime() {
    int[] testtime = new int[3];
    for (int i = 0; i < testtime.length; i++) {
      System.out.println("完成時間" + (i + 1) + ":");
      testtime[i] = scanner.nextInt();
    }
    try {
      people.setTime();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
      assertArrayEquals(testtime, people.getTime());

  }

  @Test
  public void testSetTime() {
    int[] testtime = new int[3];
    for (int i = 0; i < testtime.length; i++) {
      System.out.println("完成時間" + (i + 1) + ":");
      testtime[i] = scanner.nextInt();
    }
    try {
      people.setTime();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertArrayEquals(testtime, people.getTime());
  }

  @Test
  public void testGetsegTarget() {
    String[] target = new String[3];
    for (int i = 0; i < target.length; i++) {
      System.out.println("階段目標" + (i + 1) + ":");
      target[i] = scanner.nextLine();
    }
    try {
      people.setsegTarget();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
   assertArrayEquals(target, people.getsegTarget());
  }

  @Test
  public void testSetsegTarget() {
    String[] target = new String[3];
    for (int i = 0; i < target.length; i++) {
      System.out.println("階段目標" + (i + 1) + ":");
      target[i] = scanner.nextLine();
    }
    try {
      people.setsegTarget();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
      assertArrayEquals(target, people.getsegTarget());
  }

}
