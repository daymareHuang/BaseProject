package music_player;

public class MP3Player implements MusicPlayer {

  public void play() {
    System.out.printf("Playing ");
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
