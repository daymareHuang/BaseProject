import java.util.Scanner;

import com.jaunt.*;

//Jaunt demo: searches for 'butterflies' at Google and prints urls of search results from first page.

public class GoogleScraperDemo {
  private String answer;
  private Elements links;
  
  public void googlesearch() throws JauntException{    
    UserAgent userAgent = new UserAgent();      //create new userAgent (headless browser)
    Scanner scanner = new Scanner(System.in);
    System.out.println("�п�J�A�ҷQ�n�d�����(�H�^���J): ");
    answer = scanner.nextLine();
    System.out.println("�A�ҭn����Ʀp�U:\n");
    
 
    
    userAgent.settings.autoSaveAsHTML = true;
    userAgent.visit("http://google.com?hl=en");          //visit the english version of google 
    userAgent.doc.apply(answer);         //apply form input (starting at first editable field)
    userAgent.doc.submit("Google Search");      //click submit button labelled "Google Search"
    
    links = userAgent.doc.findEvery("<h3 class=r>").findEvery("<a>");   //find search result links 
    for(Element link : links) System.out.println(link.getAt("href"));            //print results
    
  }
}