import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadingFile {
    public static void main(String args[]) throws IOException {
        File file = new File("File1.txt");
        File file2 = new File("File2.txt"); // file not exists

        if (file2.exists()) {
            Scanner T1 = new Scanner(file2);
            System.out.println(T1.nextLine());
            T1.close();
        } else {
            JOptionPane.showMessageDialog(null, "Your file does not exists"); // output
        }

        if (file.exists()) {
            Scanner Text = new Scanner(file);

            System.out.println(Text.nextLine());
            System.out.println(Text.nextLine());

            Text.close();
        } else {
            JOptionPane.showMessageDialog(null, "Your file does not exists");
        }
    }

}
