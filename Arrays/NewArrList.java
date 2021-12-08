import java.util.*;

public class NewArrList {
    public static void main(String args[]) {
        ArrayList<Integer> Arr = new ArrayList<>(5);
        System.out.println(Arr); // Empty List;
        Arr.add(12);
        Arr.add(45);
        System.out.println(Arr); // [12,45]
    }
}