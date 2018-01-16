import java.io.IOException;
import java.util.Scanner;

import com.jaunt.JauntException;

public class Main {

  static People people = new People();

  /**
   * 創建人物.
   * 
   * @throws JauntException
   * @throws IOException
   */
  public static void main(String[] args) throws JauntException, IOException {

    int in;
    Scanner scanner = new Scanner(System.in);
    GoogleScraperDemo googleScraperDemo = new GoogleScraperDemo();
    Music music = new Music();
    open();
    people.setPeople();

    while (true) {
      try {
        System.out.println("1:可協助的工具");
        System.out.println("2:顯示人物資訊");
        System.out.println("3:顯示人物資訊");
        System.out.println("4:檢視讀書進度");
        System.out.println("5:娛樂功能");
        System.out.println("6:建立表格");
        in = scanner.nextInt();
        switch (in) {
        case 1:
          googleScraperDemo.setKeyword();
          googleScraperDemo.GoogleSearch();
          googleScraperDemo.showGoogleSearchResult();
          break;
        case 2:
          peopleprint();
          break;
        case 3:
          music.music();
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
        default:
          close();
          break;
        }

      } catch (NotEnglishException notEnglish) {
        notEnglish.printStackTrace();
      }
    }
  }

  public static void open() {
    System.out.println("Welcome!!");

  }

  public static void close() {
    System.exit(0);
  }

  public static boolean peopleinfor() {
    if (people.getfinalTarget() == "") {
      return false;
    }
    return true;
  }

  public static String peopleprint() {

    System.out.println("人物名字:" + people.getName());
    System.out.println("最終目標:" + people.getfinalTarget());
    for (int i = 0; i < people.getsegTarget().length; i++) {
      System.out.println("分段目標" + i + ":" + people.getsegTarget()[i]);
    }
    for (int i = 0; i < people.getTime().length; i++) {
      System.out.println("完成時間" + i + ":" + people.getTime()[i]);
    }

    return "Sucess";
  }

}
