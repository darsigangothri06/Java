public class TryFirst {
    public static void main(String args[]) {
        try {
            System.out.println(2 / 0);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
