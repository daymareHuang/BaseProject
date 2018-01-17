package music_player;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ConnetTest {

  @Test
  public void testYT() throws IOException {
    Connet connet = new Connet();
    assertEquals("https://www.youtube.com/",connet.targetUrl);
    connet.YT();
  }

  public void says() throws IOException {
    Connet connet = new Connet();
    assertEquals("https://www.youtube.com/",connet.targetUrl);
    connet.says();
  }
  
}
