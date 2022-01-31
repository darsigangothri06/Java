public class ThrowsKeyword {
    void inner() throws ArithmeticException {
        throw new ArithmeticException("Exception Sent");
    }

    void outer() throws ArithmeticException {
        inner();
    }

    public static void main(String args[]) {
        ThrowsKeyword obj = new ThrowsKeyword();
        try {
            obj.outer();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}
