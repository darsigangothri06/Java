public class NestedTry {
    public static void main(String args[]) {
        try {
            System.out.println("First try");
            int a = 2 + 3;
            System.out.println("value of a is: " + a);
            try {
                System.out.println(2 / 0); // AE
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
