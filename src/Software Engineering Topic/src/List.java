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
 
/*=======================���͵���===========================*/
  public List() {
    //Setup JFrame
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    f=new JFrame("�s���");
    f.setSize(600,300);//�����j�p
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
    JButton addColumn=new JButton("�W�[���");
    addColumn.addActionListener(this);
    JButton removeColumn=new JButton("�������");
    removeColumn.addActionListener(this);
    JButton addRow=new JButton("�W�[����");
    addRow.addActionListener(this);
    JButton removeRow=new JButton("��������");
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
  
//===========================================�Ыت��=========================================================  
  public void actionPerformed(ActionEvent e) {
    String cmd=e.getActionCommand();
   /*------------------------------------�W�[���-----------------------------------*/
    if (cmd.equals("�W�[���")) {
      dtm.addColumn("���" + cid);  //����ݼW�[�@��
      int columnCount=dtm.getColumnCount();  //�s�`���
      status.setText("�w�s�W���, �`�����" + columnCount);
      ++cid;
      }
    /*------------------------------------�W�[����-----------------------------------*/  
    if (cmd.equals("�W�[����")) {
        if(cid == 1) {
          String msg="�|���s�W���";
          status.setText(msg);
        }
        else {
          int rowCount=dtm.getRowCount();
          dtm.addRow(new Vector());//�S����� : �b���ݥ[�@�C
          dtm.setValueAt("��J���� ", rowCount, 0);  //�b�Ĥ@�x�s����ܦC��
          status.setText("�w�s�W����");
          ++rid;
        }
        
        }
    /*------------------------------------�R�����----------------------------------*/  
    if (cmd.equals("�������")) {
      int columnCount=dtm.getColumnCount();
      int lastColumnID=columnCount-1;
      if(cid == 1) {
        String msg="�L����R��";
        status.setText(msg);
      }
      else { //no column selected
        TableColumnModel columnModel=jt.getColumnModel();
        TableColumn column=columnModel.getColumn(lastColumnID);
        columnModel.removeColumn(column);
        dtm.setColumnCount(columnCount-1);
        String msg="�w�R�����" + ", �`�����" + dtm.getColumnCount();
        status.setText(msg);
        --cid;
        }
      }
    /*--------------------------------------�R������----------------------------------*/  
    if (cmd.equals("��������")) {
      int rowCount=dtm.getRowCount();
      int lastRowID=rowCount-1;
      if(rid == 0) {
        String msg="�L���ʥi�R��";
        status.setText(msg);
      }
      else { //�L��� : �R���̫�@�C
        dtm.removeRow(lastRowID);
        dtm.setRowCount(rowCount-1);
        String msg="�w�R������";
        status.setText(msg);
        --rid;
        }
      }
    }
//=============================================�������=========================================================  
class WindowHandler extends WindowAdapter {
  JFrame f;
  public WindowHandler(JFrame f) {this.f=f;}
  public void windowClosing(WindowEvent e) {
    int result=JOptionPane.showConfirmDialog(f,
               "�T�w�n�����{����?",
               "�T�{�T��",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.WARNING_MESSAGE);
    if (result==JOptionPane.YES_OPTION) {System.exit(0);}
    }
  }
}
