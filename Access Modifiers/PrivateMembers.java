class A {
    private int j = 90;

    void show() {
        System.out.println(j);
    }
}

class B extends A {
    void dis() {
        // System.out.println(j); ----- A.j is not visible
    }
}

public class PrivateMembers {
    public static void main(String args[]) {
        A k = new A();
        k.show();
        B o = new B();
        o.show();
    }
}
