import java.util.Scanner;

import com.jaunt.*;

//Jaunt demo: searches for 'butterflies' at Google and prints urls of search results from first page.

public class GoogleScraperDemo {
  private String answer;
  private Elements links;
  
  public void setKeyword() throws NotEnglishException {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("請輸入你所想要查的資料(以英文輸入): ");
    answer = scanner.nextLine();
    if(!answer.matches("[a-zA-Z0-9|\\.]*")) {
      throw new NotEnglishException();
    }
  }
  public String getKeyword() {
    return answer;
  }
  
  public void GoogleSearch() throws JauntException {    
    UserAgent userAgent = new UserAgent();      //create new userAgent (headless browser)
    
      System.out.println("你所要的資料如下:\n");
      userAgent.settings.autoSaveAsHTML = true;
      userAgent.visit("http://google.com?hl=en");          //visit the english version of google 
      userAgent.doc.apply(answer);                         //apply form input (starting at first editable field)
      userAgent.doc.submit("Google Search");               //click submit button labelled "Google Search"
      
      links = userAgent.doc.findEvery("<h3 class=r>").findEvery("<a>");            //find search result links 
     
  }
  
  public void showGoogleSearchResult() throws JauntException {
    for(Element link : links) System.out.println(link.getAt("href"));            //print results
  }
  
}