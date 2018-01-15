
public class NoResultFoundException extends Exception {

  public NoResultFoundException() {
    super("\"No result can be showed\"");
  }
  
  public NoResultFoundException(String message) {
    super(message);
  }
}
