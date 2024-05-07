import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hi " + name);
        String matric_number = JOptionPane.showInputDialog("Input your matric number");
        JOptionPane.showMessageDialog(null, "is the following matric number correct " + matric_number);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa"));
        JOptionPane.showMessageDialog(null, "your current gpa is " + grade );
    }
}
