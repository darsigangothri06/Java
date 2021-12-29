import java.io.IOException;
import java.io.PrintWriter;

public class WritingFile {
    public static void main(String args[]) throws IOException {
        // creates the file if file does not exists
        // if file exits, it will replace the file
        PrintWriter Write = new PrintWriter("File1.txt");
        Write.println("This is Line 1");
        Write.println("This is Line 2");

        Write.close();
    }

}
