public class ThrowDemo {
    public static void main(String args[]) {
        try {
            String s = null;
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format in conversion");
            throw new ArithmeticException("Invalid");
        } catch (ArithmeticException e) {
            System.out.println("I'm here at AE");
        }
    }
}
