package Mathematics;

import java.util.Scanner;

public class Factorial {
    public void FindFact() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = inp.nextInt();
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + a + " is: " + fact);
    }
}
