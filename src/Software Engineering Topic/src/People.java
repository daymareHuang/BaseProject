import java.util.Scanner;

public class People {

  private String name;
  private String finalTarget;
  private int[] time = new int[3];
  private String[] segTarget = new String[3];
  private Scanner scanner = new Scanner(System.in);
  private boolean done = false;

  /**
   * 建立人物.
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
   * 獲取名字.
   * @throws Exception 
   */
  public void setName() throws Exception {
    done = false;

    while (done != true) {
        System.out.println("名字:");
        name = scanner.nextLine();
        if (name.equals("")) {
          throw new Exception("名字不可為空白");
        }
        done = true;
    }
    ;
  }

  public String getfinalTarget() {
    return finalTarget;
  }

  public void setfinalTarget() {
    System.out.println("最終目標:");
    finalTarget = scanner.nextLine();
  }

  public int[] getTime() {
    return time;
  }

  /**
   * 獲取完成時間.
   * @throws Exception 
   */
  public void setTime() throws Exception {
    done = false;

    int[] time = new int[3];

    while (done != true) {
        System.out.println("目標完成時間，範例填入0204");
        for (int i = 0; i < time.length; i++) {
          System.out.println("完成時間" + (i + 1) + ":");
          time[i] = scanner.nextInt();
        }
        if (time[0] > time[1] || time[1] > time[2] || time[0] > time[2]) {
          throw new Exception("前目標時間，不可超越後目標");
        }
        done = true;

    }
    ;

    this.time = time;
  }

  public String[] getsegTarget() {
    return segTarget;
  }

  /**
   * 獲取階段目標.
   * @throws Exception 
   */
  public void setsegTarget() throws Exception {
    done = false;

    String[] target = new String[3];
    while (done != true) {
      System.out.println("階段目標");
        for (int i = 0; i < target.length; i++) {
          System.out.println("階段目標" + (i + 1) + ":");
          target[i] = scanner.nextLine();
          if (target[i].equals("") == true) {
            throw new Exception("目標不可空白");
          }
        }
        done = true;
    }
    ;

    segTarget = target;
  }

}
