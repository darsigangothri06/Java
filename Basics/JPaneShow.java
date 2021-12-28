import javax.swing.JOptionPane;

public class JPaneShow {
    public static void main(String args[]) {
        String surname = JOptionPane.showInputDialog("Enter your surname: ");
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, surname + " " + name);
    }

}
