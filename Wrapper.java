public class Wrapper {
    public static void main(String args[]) {
        int x = 234;
        Integer aObjInteger = Integer.valueOf(x);
        if (aObjInteger instanceof Integer)
            System.out.println("yes: " + aObjInteger);

        int y = aObjInteger.intValue();
        System.out.println(y);

        int k = 34;
        Integer pi = Integer.valueOf(k);
        System.out.println(pi);
    }
}
