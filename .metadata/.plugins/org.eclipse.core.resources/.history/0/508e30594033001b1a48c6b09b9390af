import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class SwingDemo {
   public static void main(String[] args) {
      JButton button1 = new JButton("One");
      JButton button2 = new JButton("Two");
      JButton button3 = new JButton("Three");
      JButton button4 = new JButton("Four");
      JButton button5 = new JButton("Five");
      JButton button6 = new JButton("Six");
      Icon icon = new ImageIcon("E:\\editicon.PNG");
      JButton button7 = new JButton(icon);
      Box box = Box.createVerticalBox();
      box.add(button1);
      box.add(button2);
      box.add(button3);
      box.add(button4);
      box.add(button5);
      box.add(button6);
      box.add(button7);
      JFrame frame = new JFrame();
      frame.add(box);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationByPlatform(true);
      frame.setSize(500, 300);
      frame.setVisible(true);
   }
}