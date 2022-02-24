interface Square {
    int calculate(int x, int y);
}

public class FunctionalInterface {
    public static void main(String args[]) {
        int a = 5, b = 56;
        Square s;
        s = (int x, int y) -> x * y;
        int ans = s.calculate(a, b);
        System.out.println(ans);
    }
}
