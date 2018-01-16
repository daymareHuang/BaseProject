package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Menu implements ActionListener {
  JFrame f;
  JButton easy, medium, hard;

  public static void main(String argv[]) {
    new Menu();
  }

  public Menu() {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    f = new JFrame("Menu");
    f.setBounds(0, 0, 400, 300);
    f.setVisible(true);
    Container cp = f.getContentPane();
    cp.setLayout(null); 
    easy = new JButton("���");
    easy.setBounds(200, 30, 100, 40);
    medium = new JButton("����");
    medium.setBounds(200, 110, 100, 40);
    hard = new JButton("����");
    hard.setBounds(200, 190, 100, 40);
    easy.addActionListener(this);
    medium.addActionListener(this);
    hard.addActionListener(this);
    JLabel text1 = new JLabel("����: ��a�p");
    JLabel text2 = new JLabel("�u������:");
    JLabel text3 = new JLabel("�����a�p�аO");
    JLabel text4 = new JLabel("�k��: �аO�a�p");
    text1.setBounds(20, 20, 100, 40);
    text2.setBounds(20, 60, 100, 40);
    text3.setBounds(80, 60, 100, 40);
    text3.setBounds(80, 60, 100, 40);
    text4.setBounds(20, 100, 100, 40);
    cp.add(text1);
    cp.add(text2);
    cp.add(text3);
    cp.add(text4);
    cp.add(easy);
    cp.add(medium);
    cp.add(hard);
    f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        int result = JOptionPane.showConfirmDialog(f, "�T�w�n�����{����?", "�T�{�T��", JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
          System.exit(0);
        }
      }
    });
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == easy) {
      Game g = new Game(400, 450, 9, 9, 10);
    } else if (e.getSource() == medium) {
      Game g = new Game(600, 650, 14, 14, 24);
    } else if (e.getSource() == hard) {
      Game g = new Game(800, 850, 19, 19, 45);
    }

  }
}
