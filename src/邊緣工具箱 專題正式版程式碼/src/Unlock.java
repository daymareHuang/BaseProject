package checkSchedule;

public class Unlock {
  private int area;
  
  public Unlock(int area){
    this.area = area;
  }
  
  public void setArea() {
    if(area < 100) {
      area ++;
      System.out.println("���߱z����s�ϰ�");
    } else {
      System.out.println("�z�w�g���Y�����ϰ�");
    }
  }
  
  public int getArea() {
    return area;
  }
}
