import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ListTest {
  
  private static List MyTestList;
  private static ActionEvent NewAct;
  private static ActionEvent DelAct;
  private static ActionEvent NewDate;
  private static ActionEvent DelDate;

  @BeforeAll //test之前的設定
  static void setUpBeforeClass() throws Exception {
    /*程式碼 /按鈕id/String 指令*/
    MyTestList=new List();
    NewAct=new ActionEvent(0,0,"增加活動");
    DelAct=new ActionEvent(0,0,"移除活動");
    NewDate=new ActionEvent(0,0,"增加日期");
    DelDate=new ActionEvent(0,0,"移除日期");
  }
  
  @AfterAll //test後
  static void tearDownAfterClass() throws Exception {
    MyTestList=null;
    NewAct=null;
    DelAct=null;
    NewDate=null;
    DelDate=null;
  }

  @Test
  void test() {
    //按按鈕
    MyTestList.actionPerformed(NewAct);
    MyTestList.actionPerformed(DelAct);
    MyTestList.actionPerformed(DelDate);
    MyTestList.actionPerformed(NewDate);
    MyTestList.actionPerformed(NewAct);
    MyTestList.actionPerformed(DelAct);
    MyTestList.actionPerformed(DelDate);
  }

}
