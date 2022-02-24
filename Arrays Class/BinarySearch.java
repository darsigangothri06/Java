import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        int a[] = new int[] { 12, 23, 54, 67, 90, 91 };
        int k = Arrays.binarySearch(a, 23);
        System.out.println(k);
        int o = Arrays.binarySearch(a, 100);
        System.out.println(o);
        int u = Arrays.binarySearch(a, 2, 4, 34);
        System.out.println(u);
    }
}
