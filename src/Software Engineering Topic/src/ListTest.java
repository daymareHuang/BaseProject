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

  @BeforeAll //test���e���]�w
  static void setUpBeforeClass() throws Exception {
    /*�{���X /���sid/String ���O*/
    MyTestList=new List();
    NewAct=new ActionEvent(0,0,"�W�[����");
    DelAct=new ActionEvent(0,0,"��������");
    NewDate=new ActionEvent(0,0,"�W�[���");
    DelDate=new ActionEvent(0,0,"�������");
  }
  
  @AfterAll //test��
  static void tearDownAfterClass() throws Exception {
    MyTestList=null;
    NewAct=null;
    DelAct=null;
    NewDate=null;
    DelDate=null;
  }

  @Test
  void test() {
    //�����s
    MyTestList.actionPerformed(NewAct);
    MyTestList.actionPerformed(DelAct);
    MyTestList.actionPerformed(DelDate);
    MyTestList.actionPerformed(NewDate);
    MyTestList.actionPerformed(NewAct);
    MyTestList.actionPerformed(DelAct);
    MyTestList.actionPerformed(DelDate);
  }

}
