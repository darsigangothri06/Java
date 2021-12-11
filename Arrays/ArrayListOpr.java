import java.util.*;

public class ArrayListOpr {
    public static void main(String args[]) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(12);
        Arr.add(23);
        Arr.add(56);
        System.out.println(Arr.size()); // 3

        int k = Arr.get(2);
        System.out.println(k);
    }
}