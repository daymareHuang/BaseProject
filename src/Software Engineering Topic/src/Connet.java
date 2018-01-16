package music_player;

import java.io.IOException;

public class Connet {
  final String targetUrl = "https://www.youtube.com/";
  
  public void YT() throws IOException {
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
  }
}