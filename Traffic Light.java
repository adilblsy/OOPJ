import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JPanel implements ActionListener {

   private JRadioButton b1;
   private JRadioButton b2;
   private JRadioButton b3;

   private Color rd;
   private Color yl;
   private Color gr; 

   public TrafficLight() {
      setBounds(0,0,600,400);

      b1 = new JRadioButton("Go");
      b2 = new JRadioButton("Slow");
      b3 = new JRadioButton("Stop");

      b1.setSelected(true);
      rd = getBackground();
      gr = Color.green;
      yl = getBackground();

      ButtonGroup gp = new ButtonGroup();
      gp.add(b1);
      gp.add(b2);
      gp.add(b3);

      add(b1);
      add(b2);
      add(b3);

      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawOval(270,50,50,50);
      g.drawOval(270,120,50,50);
      g.drawOval(270,190,50,50);
      g.setColor(gr);
      g.fillOval(270,50,50,50);
      g.setColor(yl);
      g.fillOval(270,120,50,50);
      g.setColor(rd);
      g.fillOval(270,190,50,50);
   }

   public void actionPerformed(ActionEvent e) {
      if (b3.isSelected() == true) {
         rd = Color.red;
         gr = getBackground();
         yl = getBackground();
      }
      else if (b1.isSelected() == true) {
         rd = getBackground();
         gr = Color.green;
         yl = getBackground();
      }
      else {
         rd = getBackground();
         gr = getBackground();
         yl = Color.yellow;
      }
      repaint();
   }

   public static void main(String [] args) {
      JFrame f = new JFrame();
      f.setVisible(true);
      f.setSize(600,400);
      f.setLayout(null);
      TrafficLight tl = new TrafficLight();
      f.add(tl);
   }
}