import java.util.*;

public class Equals {
    public static void main(String args[]) {
        int a[] = new int[] { 12, 13, 14, 15 };
        int b[] = new int[] { 12, 13, 14, 15 };
        int c[] = new int[] { 13, 10 };
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
    }
}
