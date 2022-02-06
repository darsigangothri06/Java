class Check {
    void result() throws ArithmeticException {
        try {
            System.out.println("in try block...");
            return;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Executing after return statement");
        }
    }
}

public class FinallyBlock {
    public static void main(String args[]) {
        Check obj = new Check();
        obj.result();
    }
}
