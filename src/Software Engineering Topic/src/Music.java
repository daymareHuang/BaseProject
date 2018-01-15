

import java.io.IOException;
import java.util.Scanner;

public class Music{

  private static Scanner scanner;

  public void music() throws IOException {
    MP3Player mp3 = new MP3Player();
    Connet yt = new Connet();
    Choise choise = new Choise();
    Search search = new Search();
    
    choise.strat();//嚙踝蕭豲蕭�蹓蕭嚙踝蕭
    scanner = new Scanner(System.in);
    char option = (char)scanner.next().charAt(0);
    if (option == 'a' || option == 'A'){
      choise.songs();
      choise.show(); 
      char ch1 = (char)scanner.next().charAt(0);
      if (ch1 == 'a' || ch1 == 'A'){
       
      }
    }
    else if (option == 'b' || option == 'B'){
      yt.YT();
    }
    else if (option == 'c' || option == 'C'){
      search.name();
    }
  }
}