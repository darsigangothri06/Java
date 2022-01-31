public class MultipleCatch {
    public static void main(String args[]) {
        try {
            String s = null;
            int a = 0;
            String str = "gangothri";
            System.out.println(s.charAt(0));
            System.out.println(3 / a);
        } catch (NullPointerException NPE) {
            System.out.println(NPE);
        } catch (ArithmeticException e) { // this is not going to execute
            System.out.println(e);
        }
    }
}
