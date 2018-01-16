import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import com.jaunt.JauntException;

public class GoogleScraperDemoTest {
  GoogleScraperDemo google = new GoogleScraperDemo();
  Scanner scanner = new Scanner(System.in);
  String abc = "abc";
  String abc2 = "abc";
  NotEnglishException e = new NotEnglishException();

  @Test
  public void testgetKeyword() throws NotEnglishException {
    google.setKeyword();
    Assert.assertEquals("False", google.getKeyword(), google.getKeyword());

    try {
      google.setKeyword();
    } catch (NotEnglishException e) {
      e.printStackTrace();
    }

  }

  @Test
  public void testGoogleSearch() {
  
      try {
        google.GoogleSearch();
      } catch (JauntException e) {
        e.printStackTrace();
      }
   
  }

}
