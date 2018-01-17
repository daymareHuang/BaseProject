package music_player;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Choise {
  MP3Player mp3 = new MP3Player();
  Music music = new Music();
  private Scanner scanner;
  public void strat() {

    System.out.println("Input your choose.");
    System.out.println("a.Show the phone data");
    System.out.println("b.Connet to the Youtube");
  }
  
  public void songs() {
    
    System.out.println("1.Alan Walker - faded");
    System.out.println("2.Martin Garrix - Scared To Be Lonely");
    System.out.println("3.Kygo - Stargazing");
    System.out.println("4.Clean Bandit - Tears");
    System.out.println("5.Halsey - Bad At Love");
    System.out.println("6.Blue - Guilty");
    System.out.println("7.Maroon 5 - Payphone");
    
  } 
  
public void name(int ch1) {
    switch(ch1){
    case 1:System.out.println("Alan Walker - faded");break;
    case 2:System.out.println("Martin Garrix - Scared To Be Lonely");break;
    case 3:System.out.println("Kygo - Stargazing");break;
    case 4:System.out.println("Clean Bandit - Tears");break;
    case 5:System.out.println("Halsey - Bad At Love");break;
    case 6:System.out.println("Blue - Guilty");break;
    case 7:System.out.println("Maroon 5 - Payphone");break;
    }
  } 
public void player() throws InputMismatchException{
  scanner = new Scanner(System.in);
  int ch1;
  try{
  do{
  System.out.println("Input the number.");
  System.out.println("1.Stop");
  System.out.println("2.Pause");
  System.out.println("3.Next");
  System.out.println("4.Previous");
  System.out.println("5.Play");
  System.out.println("6.Return");
  
  ch1 = scanner.nextInt();
  switch(ch1){
  case 1:mp3.stop();break;
  case 2:mp3.pause();break;
  
  case 3:mp3.next();
  Random ran = new Random();
  name(ran.nextInt(7));
  break;
  
  case 4:mp3.previous();
  Random ran1 = new Random();
  name(ran1.nextInt(7));
  break;
  
  case 5:
  System.out.println("Please choise the song.");
  songs();
  ch1 = scanner.nextInt();
    mp3.play();
    name(ch1);
  break;
  case 6:Music.Music();break;
  default:player();
    }
  }while(ch1!=1);
  
  }catch(Exception c){
    System.out.println("You have to meet the condition.");
    player();
  }
  
  }

}


