class A {
    A() {
        System.out.println("in a");
    }
}

class B extends A {
    B() {
        System.out.println("in b");
    }
}

public class SuperConstructorCalling {
    public static void main(String args[]) {
        B k = new B();
    }
}
