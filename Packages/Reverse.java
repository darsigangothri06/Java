package Mathematics;

import java.util.Scanner;

public class Reverse {
    public void FindRev() {
        System.out.println("Enter a number to find reverse of it: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int num = a;
        int rev = 0;
        while (a > 0) {
            rev = rev * 10 + (a % 10);
            a = a / 10;
        }
        System.out.println("Reverse of " + num + " is: " + rev);
    }
}
