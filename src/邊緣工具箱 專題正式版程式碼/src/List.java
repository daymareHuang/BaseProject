import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import java.util.*;

public class List implements ActionListener {

  JFrame f;
  JTable jt;
  DefaultTableModel dtm;
  JLabel status;
  int cid=1;
  int rid=0;
 
/*=======================產生視窗===========================*/
  public List() {
    //Setup JFrame
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    f=new JFrame("新表格");
    f.setSize(600,300);//視窗大小
    f.setLocationRelativeTo(null);
    Container cp=f.getContentPane();
    //cp.setLayout(null);

    //Build Elements
    dtm=new DefaultTableModel();
    jt=new JTable(dtm);
    jt.setPreferredScrollableViewportSize(f.getSize());
    jt.setCellSelectionEnabled(true);
    jt.setRowSelectionAllowed(true);
    jt.setColumnSelectionAllowed(true); 
    cp.add(new JScrollPane(jt),BorderLayout.CENTER);
    //setup button
    JPanel panel=new JPanel(new GridLayout(1,5));
    JButton addColumn=new JButton("增加日期");
    addColumn.addActionListener(this);
    JButton removeColumn=new JButton("移除日期");
    removeColumn.addActionListener(this);
    JButton addRow=new JButton("增加活動");
    addRow.addActionListener(this);
    JButton removeRow=new JButton("移除活動");
    removeRow.addActionListener(this);
    panel.add(addColumn);
    panel.add(removeColumn);
    panel.add(addRow);
    panel.add(removeRow);
    cp.add(panel,BorderLayout.NORTH);
    status=new JLabel(" ");
    cp.add(status,BorderLayout.SOUTH);
    f.setVisible(true);

    //Close JFrame       
    f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    f.addWindowListener(new WindowHandler(f)); 
    }
  
//===========================================創建表格=========================================================  
  public void actionPerformed(ActionEvent e) {
    String cmd=e.getActionCommand();
   /*------------------------------------增加日期-----------------------------------*/
    if (cmd.equals("增加日期")) {
      dtm.addColumn("日期" + cid);  //於尾端增加一行
      int columnCount=dtm.getColumnCount();  //新總行數
      status.setText("已新增日期, 總日期數" + columnCount);
      ++cid;
      }
    /*------------------------------------增加活動-----------------------------------*/  
    if (cmd.equals("增加活動")) {
        if(cid == 1) {
          String msg="尚未新增日期";
          status.setText(msg);
        }
        else {
          int rowCount=dtm.getRowCount();
          dtm.addRow(new Vector());//沒有選取 : 在尾端加一列
          dtm.setValueAt("輸入活動 ", rowCount, 0);  //在第一儲存格顯示列號
          status.setText("已新增活動");
          ++rid;
        }
        
        }
    /*------------------------------------刪除日期----------------------------------*/  
    if (cmd.equals("移除日期")) {
      int columnCount=dtm.getColumnCount();
      int lastColumnID=columnCount-1;
      if(cid == 1) {
        String msg="無日期刪除";
        status.setText(msg);
      }
      else { //no column selected
        TableColumnModel columnModel=jt.getColumnModel();
        TableColumn column=columnModel.getColumn(lastColumnID);
        columnModel.removeColumn(column);
        dtm.setColumnCount(columnCount-1);
        String msg="已刪除日期" + ", 總日期數" + dtm.getColumnCount();
        status.setText(msg);
        --cid;
        }
      }
    /*--------------------------------------刪除活動----------------------------------*/  
    if (cmd.equals("移除活動")) {
      int rowCount=dtm.getRowCount();
      int lastRowID=rowCount-1;
      if(rid == 0) {
        String msg="無活動可刪除";
        status.setText(msg);
      }
      else { //無選取 : 刪除最後一列
        dtm.removeRow(lastRowID);
        dtm.setRowCount(rowCount-1);
        String msg="已刪除活動";
        status.setText(msg);
        --rid;
        }
      }
    }
//=============================================關閉表格=========================================================  
class WindowHandler extends WindowAdapter {
  JFrame f;
  public WindowHandler(JFrame f) {this.f=f;}
  public void windowClosing(WindowEvent e) {
    int result=JOptionPane.showConfirmDialog(f,
               "確定要結束程式嗎?",
               "確認訊息",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.WARNING_MESSAGE);
    if (result==JOptionPane.YES_OPTION) {System.exit(0);}
    }
  }
}
