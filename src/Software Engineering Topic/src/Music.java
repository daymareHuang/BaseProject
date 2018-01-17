package music_player;

import java.io.IOException;
import java.util.Scanner;

public class Music{

  private static Scanner scanner;

  public static void main(String[] args) throws IOException ,Exception{
    MP3Player mp3 = new MP3Player();
    Connet yt = new Connet();
    Choise choise = new Choise();
    
    choise.strat();//初始選項
    scanner = new Scanner(System.in);
    char option = (char)scanner.next().charAt(0);
    int ch1;
    switch(option){
    case 'a':
      System.out.println("Please choise the song.");
      choise.songs(); 
      try{
      ch1 = scanner.nextInt();
      if(1<ch1 && ch1<8){
      mp3.play();
      choise.name(ch1);
      choise.player();
      }
      else if(ch1==1){
        mp3.stop();
        break;
        }
      else 
        System.out.println("You have to meet the condition.");
      main(null);
      }catch(Exception c){
        System.out.println("You have to meet the condition.");
        main(null);
      }
      break;
    case 'A':
      System.out.println("Please choise the song.");
      choise.songs(); 
      try{
      ch1 = scanner.nextInt();
      if(ch1<8){
      mp3.play();
      choise.name(ch1);
      choise.player();
      }
      else 
        System.out.println("You have to meet the condition.");
      }catch(Exception c){
        System.out.println("You have to meet the condition.");
      }
      break;
    case 'b': yt.YT();break;
    case 'B': yt.YT();break; 
    case 'c': yt.says();break;
    case 'C': yt.says();break;
    default: main(null);
      }
    }
  }
