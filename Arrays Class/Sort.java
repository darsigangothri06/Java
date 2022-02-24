import java.util.*;

public class Sort {
    public static void main(String args[]) {
        int a[] = new int[] { 12, 1, 14, 11, 10, 9, 2 };
        Arrays.sort(a);
        for (int i : a)
            System.out.print(i + " ");
        int b[] = new int[] { 12, 1, 14, 11, 10, 9, 2 };
        Arrays.sort(b, 2, 5);
        System.out.println();
        for (int i : b)
            System.out.print(i + " ");
    }
}
