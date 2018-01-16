package music_player;

import org.junit.Test;

public class ChoiseTest {

  Choise choose = new Choise();
  @Test
  public void testStrat() {
    choose.strat(); 
  }


  @Test
  public void testSongs() {
    choose.songs();
  }

  @Test
  public void testName() {
    int ch1 = 0;
    choose.name(ch1);
    System.out.println("finish.");
  }

  @Test
  public void testPlayer() {
    choose.player();
  }

}
