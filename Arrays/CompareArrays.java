public class CompareArrays {
    public static void main(String args[]) {
        int[] num1 = { 1, 2, 3, 4, 5 };
        int[] num2 = { 1, 2, 3, 4, 5 };
        if (num1 == num2)
            System.out.println("They are eql");
        else
            System.out.println("They are not eql");

        num2 = num1;
        if (num1 == num2)
            System.out.println("They are eql");
        else
            System.out.println("They are not eql");
    }

}
