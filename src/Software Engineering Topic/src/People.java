import java.util.Scanner;

public class People {

  private String name;
  private String finalTarget;
  private int[] time = new int[3];
  private String[] segTarget = new String[3];
  private Scanner scanner = new Scanner(System.in);
  private boolean done = false;

  /**
   * �إߤH��.
   */
  public void setPeople() {
    setName();
    setfinalTarget();
    setsegTarget();
    setTime();
  }

  public String getName() {
    return name;
  }

  /**
   * ����W�r.
   */
  public void setName() {
    done = false;

    while (done != true) {
      try {
        System.out.println("�W�r:");
        name = scanner.nextLine();
        if (name.equals("")) {
          throw new Exception("�W�r���i���ť�");
        }
        done = true;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    ;
  }

  public String getfinalTarget() {
    return finalTarget;
  }

  public void setfinalTarget() {
    System.out.println("�̲ץؼ�:");
    finalTarget = scanner.nextLine();
  }

  public int[] getTime() {
    return time;
  }

  /**
   * ��������ɶ�.
   */
  public void setTime() {
    done = false;

    int[] time = new int[3];

    while (done != true) {
      try {
        System.out.println("�ؼЧ����ɶ��A�d�Ҷ�J0204");
        for (int i = 0; i < time.length; i++) {
          System.out.println("�����ɶ�" + (i + 1) + ":");
          time[i] = scanner.nextInt();
        }
        if (time[0] > time[1] || time[1] > time[2] || time[0] > time[2]) {
          throw new Exception("�e�ؼЮɶ��A���i�W�V��ؼ�");
        }
        done = true;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

    }
    ;

    this.time = time;
  }

  public String[] getsegTarget() {
    return segTarget;
  }

  /**
   * ������q�ؼ�.
   */
  public void setsegTarget() {
    done = false;

    String[] target = new String[3];
    while (done != true) {
      System.out.println("���q�ؼ�");
      try {
        for (int i = 0; i < target.length; i++) {
          System.out.println("���q�ؼ�" + (i + 1) + ":");
          target[i] = scanner.nextLine();
          if (target[i].equals("") == true) {
            throw new Exception("�ؼФ��i�ť�");
          }
        }
        done = true;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    ;

    segTarget = target;
  }

}