import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayFile {
    public static void main(String args[]) throws IOException {
        int[] arr = new int[9];
        File file = new File("Numbers.txt");
        if (file.exists()) {
            int p = 0;
            Scanner text = new Scanner(file);
            while (text.hasNext()) {
                arr[p] = Integer.parseInt(text.nextLine());
                p++;
            }
            text.close();
            for (int y : arr) {
                System.out.println(y);
            }
        } else {
            JOptionPane.showMessageDialog(null, "File does not exists!");
        }
    }
}
