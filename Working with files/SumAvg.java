import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SumAvg {
    public static void main(String args[]) throws IOException {
        PrintWriter Write = new PrintWriter("Numbers.txt");
        String input = JOptionPane.showInputDialog("Enter number of digits: ");
        int n = Integer.parseInt(input);
        for (int i = 0; i < n; i++) {
            String inp = JOptionPane.showInputDialog("Enter a number: ");
            Write.println(inp);
        }
        Write.close();
        // calculating sum, avg.

        File file = new File("Numbers.txt");
        Scanner in = new Scanner(file);
        int sum = 0;
        while (in.hasNext()) {
            sum += Integer.parseInt(in.nextLine());
        }
        in.close();

        double avg = sum / n;

        JOptionPane.showMessageDialog(null, "Sum is: " + sum + "\nAverage is: " + avg);
    }

}
