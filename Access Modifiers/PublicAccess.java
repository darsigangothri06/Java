class A {
    int i = 12; // "public" by default
}

class B extends A {
    void dis() {
        System.out.println(i);
    }
}

public class PublicAccess {
    public static void main(String args[]) {
        B k = new B();
        k.dis();
    }
}
