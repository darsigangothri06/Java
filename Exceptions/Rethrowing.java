class ReThrowDemo {
    void res() throws ArithmeticException {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught in method");
            throw e; // rethrowing
        }
    }
}

public class Rethrowing {
    public static void main(String args[]) {
        try {
            ReThrowDemo obj = new ReThrowDemo();
            obj.res();
        } catch (ArithmeticException e) {
            System.out.println("Caught in Main");
        }
    }
}
