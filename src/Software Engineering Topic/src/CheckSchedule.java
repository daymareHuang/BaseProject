package checkSchedule;

import java.util.Scanner;

import com.jaunt.*;

public class CheckSchedule {
  private static Scanner sc;

  public static void check() throws JauntException {
    sc = new Scanner(System.in);
    Unlock Unlocked = new Unlock(0);
    
    
    while(true) {
      System.out.println("功能選取： 1.搜尋題目或相關網址  2.輸入測驗成績   3.離開");
      System.out.printf("請選擇：");
      int choose = sc.nextInt();
      if (choose == 1) {
        UserAgent userAgent = new UserAgent();      //create new userAgent (headless browser)
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("請輸入你所想要查的資料(以英文輸入): ");
        String answer = scanner.nextLine();
        System.out.println("你所要的資料如下:\n");
        
     
        
        userAgent.settings.autoSaveAsHTML = true;
        userAgent.visit("http://google.com?hl=en");          //visit the english version of google 
        userAgent.doc.apply(answer);         //apply form input (starting at first editable field)
        userAgent.doc.submit("Google Search");      //click submit button labelled "Google Search"
        
        Elements links = userAgent.doc.findEvery("<h3 class=r>").findEvery("<a>");   //find search result links 
        for(Element link : links) System.out.println(link.getAt("href"));            //print results
        
      } else if (choose == 2) {
        int all;
        int correct;
        System.out.println("您總共做了幾題?");
        all = sc.nextInt();
        System.out.println("您答對了幾題?");
        correct = sc.nextInt();
        ExamGrade grade = new ExamGrade(all, correct);
     
        System.out.println("您的答對率為" + grade.getExamGrade());
        if (grade.getExamGrade() > 1) {
   	      System.out.println("別騙人了，哪有人答對的題目比全部的題數還多");
   	    } else if (grade.getExamGrade() >= 0.6){
   	      Unlocked.setArea();
   	      System.out.println("目前解鎖：" + Unlocked.getArea() + "/100");
   	    } else {
   	      System.out.println("請再接再厲");
   	    }
      } else if (choose == 3) {
        System.out.println("謝謝您的使用");
        break;
      } else {
        System.out.println("沒有這個選項呢");
      }
    }
  }    
}
