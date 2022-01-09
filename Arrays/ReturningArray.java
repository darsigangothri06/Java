class Arr {
    public int[] met(int arr[]) {
        return new int[] { 1, 2, 3, 4, 5 };
    }
}

public class ReturningArray {
    public static void main(String args[]) {
        Arr obj = new Arr();
        int res[] = new int[] { 5, 8, 9, 8, 9, 0 };
        int r[] = obj.met(res);
        for (int x : r) {
            System.out.print(x);
        }
    }
}
