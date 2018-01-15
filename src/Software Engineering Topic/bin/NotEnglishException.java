
public class NotEnglishException extends Exception{

  /**
   * this Exception is when you enter a String with non-English words .
   */
  private static final long serialVersionUID = -6338617329940661658L;

  public NotEnglishException() {
    super("\"The words you entered are not written in English.\"");
  }
  
  public NotEnglishException(String message) {
    super(message);
  }
}
