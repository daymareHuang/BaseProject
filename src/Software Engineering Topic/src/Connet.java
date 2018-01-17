package music_player;

import java.io.IOException;

public class Connet {
  final String targetUrl = "https://www.youtube.com/";
  final String targetUrl2 = "http://mingyanjiaju.org/juzi/renshenggeyan/2012/0503/295.html";
  
  public void YT() throws IOException {
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
  }


public void says() throws IOException {
  java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl2));
}
}