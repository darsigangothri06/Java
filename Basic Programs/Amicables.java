import java.util.Scanner;

public class Amicables {
    static int FactSum(int n) {
        int Sum = 0;
        for (int i = 1; i <= (n / 2) + 1; i++) {
            if ((n % i) == 0)
                Sum += i;
        }
        return Sum;

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int Num1, Num2;
        System.out.print("Enter number1: ");
        Num1 = in.nextInt();
        System.out.print("Enter number2: ");
        Num2 = in.nextInt();
        if ((FactSum(Num1) == Num2) && (FactSum(Num2) == Num1))
            System.out.println(Num1 + " and " + Num2 + " are Amicable numbers");
        else
            System.out.println(Num1 + " and " + Num2 + " are not amicable numbers");
    }
}
