import java.io.IOException;
import java.util.Scanner;

import com.jaunt.JauntException;

public class Main {

  static People people = new People();

  /**
   * �ЫؤH��.
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
        System.out.println("1:�i��U���u��");
        System.out.println("2:��ܤH����T");
        System.out.println("3:��ܤH����T");
        System.out.println("4:�˵�Ū�Ѷi��");
        System.out.println("5:�T�֥\��");
        System.out.println("6:�إߪ��");
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

    System.out.println("�H���W�r:" + people.getName());
    System.out.println("�̲ץؼ�:" + people.getfinalTarget());
    for (int i = 0; i < people.getsegTarget().length; i++) {
      System.out.println("���q�ؼ�" + i + ":" + people.getsegTarget()[i]);
    }
    for (int i = 0; i < people.getTime().length; i++) {
      System.out.println("�����ɶ�" + i + ":" + people.getTime()[i]);
    }

    return "Sucess";
  }

}
