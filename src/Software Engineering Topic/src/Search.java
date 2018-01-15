

import java.util.Scanner;

public class Search {//�����澈 �����迂���葡瘥��
  
  private Scanner scanner;

  public void name() {
    System.out.println("Please enter the name of song.");
    String name = null;
    name = scanner.nextLine();
    System.out.println("Searching " + name);
  }
}
