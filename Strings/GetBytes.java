public class GetBytes {
    public static void main(String args[]) {
        String str = "darsi";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
        String x = new String(b);
        System.out.println(x);

    }
}
