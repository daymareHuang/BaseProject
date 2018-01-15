

import java.util.Scanner;

public class MP3Player implements MusicPlayer {

  private Scanner scanner;

  public void play(String song) {
    
    scanner = new Scanner(System.in);
    System.out.println("Please enter the name of song.");
    song = scanner.nextLine();
    System.out.println("Playing " + song);
  }

  public void stop() {
    System.out.println("Stop Player");
  }

  public void pause() {
    System.out.println("Pause Player");
  }

  public void next() {
    System.out.println("Next song");
  }

  public void previous() {
    System.out.println("Previous song");
  }

}
