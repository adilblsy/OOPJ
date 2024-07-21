import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {

   private JLabel m1;
   private JLabel m2;
   private JLabel m3;
   private JLabel m4;
   private JTextField t1;
   private JTextField t2;
   private JButton b1;
   private JButton b2;
   private JButton b3;
   private JButton b4;

   public Calculator() {
      setSize(600,500);
      setLayout(null);

      m1 = new JLabel("Number 1");
      m2 = new JLabel("Number 2");
      m3 = new JLabel("Result:");
      m4 = new JLabel("");
      t1 = new JTextField();
      t2 = new JTextField();
      b1 = new JButton("+");
      b2 = new JButton("-");
      b3 = new JButton("*");
      b4 = new JButton("/");

      m1.setBounds(200,100,75,30);
      t1.setBounds(300,100,75,30);
      m2.setBounds(200,150,75,30);
      t2.setBounds(300,150,75,30);
      b1.setBounds(200,200,75,30);
      b2.setBounds(300,200,75,30);      
      b3.setBounds(200,250,75,30);
      b4.setBounds(300,250,75,30);
      m3.setBounds(200,300,75,30);
      m4.setBounds(300,300,75,30);

      add(m1);
      add(t1);
      add(m2);
      add(t2);
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(m3);
      add(m4);

      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e) {
      Integer num1 = Integer.parseInt(t1.getText());
      Integer num2 = Integer.parseInt(t2.getText());
      Integer result = 0;

      if(e.getSource() == b1) {
         result = num1+num2;
      }
      if(e.getSource() == b2) {
         result = num1-num2;
      }
      if(e.getSource() == b3) {
         result = num1*num2;
      }
      if(e.getSource() == b4) {
         result = num1/num2;
      }
      m4.setText(result.toString());
   }

   public static void main (String [] args) {
      Calculator ex = new Calculator();
      ex.setVisible(true);
   }
}