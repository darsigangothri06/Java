public class MultipleCatch {
    public static void main(String args[]) {
        try {
            int[] a = new int[5];
            a[5] = 34;
        } catch (NullPointerException NPE) {
            System.out.println(NPE);
        } catch (ArithmeticException e) { // this is not going to execute
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
