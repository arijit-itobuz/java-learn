
// public class test {
//   public static void main(String[] args) {

//     System.out.println("test java");

//   }
// }

import javax.swing.JOptionPane;

public class test {

  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name");
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
    
    JOptionPane.showMessageDialog(null, name + "\n" + age + "\n" + height);
  }
}