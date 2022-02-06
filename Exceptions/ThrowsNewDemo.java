import java.util.Scanner;

class Demo {
    void show() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        throw new NumberFormatException();
    }
}

public class ThrowsNewDemo {
    public static void main(String args[]) {
        Demo obj = new Demo();
        try {
            obj.show();
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e);
        }
    }
}
