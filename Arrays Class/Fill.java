import java.util.*;

public class Fill {
    public static void main(String args[]) {
        int a[] = new int[5];
        Arrays.fill(a, 10);
        for (int i : a)
            System.out.println(i);
    }
}
