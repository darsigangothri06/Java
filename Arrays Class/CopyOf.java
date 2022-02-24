import java.util.*;

public class CopyOf {
    public static void main(String args[]) {
        int a[] = new int[] { 1, 2, 3, 4, 5 };
        int b[] = Arrays.copyOf(a, 10);
        System.out.println(b[8]);
        System.out.println(b[1]);

        int c[] = Arrays.copyOf(a, 3);
        System.out.println(c[1]);

    }
}
