import Mathematics.*;
import java.util.Scanner;

public class ImportingRevFact {
    public static void main(String args[]) {
        System.out.println("Enter your choice: \n 1. Factorial \n 2. Reverse of a number \n Enter here: ");
        Scanner inp = new Scanner(System.in);
        int choice = inp.nextInt();
        if (choice == 1) {
            Mathematics.Factorial obj = new Mathematics.Factorial();
            obj.FindFact();
        } else {
            Mathematics.Reverse obj1 = new Mathematics.Reverse();
            obj1.FindRev();
        }
    }
}
