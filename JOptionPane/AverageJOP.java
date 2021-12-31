import javax.swing.JOptionPane;

public class AverageJOP {
    public static void main(String args[]) {
        String input;
        int First, Second, Sum;
        double Avg;

        input = JOptionPane.showInputDialog("Enter first number: ");
        First = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter second number: ");
        Second = Integer.parseInt(input);

        Sum = First + Second;
        Avg = Sum / 2;
        JOptionPane.showMessageDialog(null, "Sum is: " + Sum + " and Average is: " + Avg);
    }
}
