package music_player;

import org.junit.Test;

public class MP3PlayerTest {

  MP3Player mp3 = new MP3Player();
  
  @Test
  public void testPlay() {
    mp3.play();
  }

  @Test
  public void testStop() {
    mp3.stop();
  }

  @Test
  public void testPause() {
    mp3.pause();
    }

  @Test
  public void testNext() {
    mp3.next();
    }

  @Test
  public void testPrevious() {
    mp3.previous();
    }

}
