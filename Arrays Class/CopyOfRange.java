import java.util.*;

public class CopyOfRange {
    public static void main(String args[]) {
        int a[] = new int[] { 1, 2, 3, 4, 5 };
        int b[] = Arrays.copyOfRange(a, 2, 4);
        for (int i : b)
            System.out.print(i + " ");

    }
}
