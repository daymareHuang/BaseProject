package checkSchedule;

import java.util.Scanner;

import com.jaunt.*;

public class CheckSchedule {
  private static Scanner sc;

  public static void check() throws JauntException {
    sc = new Scanner(System.in);
    Unlock Unlocked = new Unlock(0);
    
    
    while(true) {
      System.out.println("�\�����G 1.�j�M�D�ةά������}  2.��J���禨�Z   3.���}");
      System.out.printf("�п�ܡG");
      int choose = sc.nextInt();
      if (choose == 1) {
        UserAgent userAgent = new UserAgent();      //create new userAgent (headless browser)
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("�п�J�A�ҷQ�n�d�����(�H�^���J): ");
        String answer = scanner.nextLine();
        System.out.println("�A�ҭn����Ʀp�U:\n");
        
     
        
        userAgent.settings.autoSaveAsHTML = true;
        userAgent.visit("http://google.com?hl=en");          //visit the english version of google 
        userAgent.doc.apply(answer);         //apply form input (starting at first editable field)
        userAgent.doc.submit("Google Search");      //click submit button labelled "Google Search"
        
        Elements links = userAgent.doc.findEvery("<h3 class=r>").findEvery("<a>");   //find search result links 
        for(Element link : links) System.out.println(link.getAt("href"));            //print results
        
      } else if (choose == 2) {
        int all;
        int correct;
        System.out.println("�z�`�@���F�X�D?");
        all = sc.nextInt();
        System.out.println("�z����F�X�D?");
        correct = sc.nextInt();
        ExamGrade grade = new ExamGrade(all, correct);
     
        System.out.println("�z������v��" + grade.getExamGrade());
        if (grade.getExamGrade() > 1) {
   	      System.out.println("�O�F�H�F�A�����H���諸�D�ؤ�������D���٦h");
   	    } else if (grade.getExamGrade() >= 0.6){
   	      Unlocked.setArea();
   	      System.out.println("�ثe����G" + Unlocked.getArea() + "/100");
   	    } else {
   	      System.out.println("�ЦA���A�F");
   	    }
      } else if (choose == 3) {
        System.out.println("���±z���ϥ�");
        break;
      } else {
        System.out.println("�S���o�ӿﶵ�O");
      }
    }
  }    
}
