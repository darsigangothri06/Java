import java.util.Scanner;

public class ThrowEx {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        try {
            if (a < 18)
                throw new ArithmeticException("You are not eligible to vote");
            else
                System.out.println("You are eligible");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
