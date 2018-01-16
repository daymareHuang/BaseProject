package checkSchedule;

public class Unlock {
  private int area;
  
  public Unlock(int area){
    this.area = area;
  }
  
  public void setArea() {
    if(area < 100) {
      area ++;
      System.out.println("恭喜您解鎖新區域");
    } else {
      System.out.println("您已經解縮全部區域");
    }
  }
  
  public int getArea() {
    return area;
  }
}
