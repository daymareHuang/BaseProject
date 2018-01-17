package music_player;

import java.io.IOException;
import java.util.Scanner;

public class Music{

  public static final String Music = null;
  private static Scanner scanner;

  public static void Music() throws IOException ,Exception{
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
      if(ch1<8){
      mp3.play();
      choise.name(ch1);
      choise.player();
      }
      else 
        System.out.println("You have to meet the condition.");
      Music();
      }catch(Exception c){
        System.out.println("You have to meet the condition.");
        Music();
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
    default: Music();
      }
    }
  }
