class A {
    void show() {
        System.out.println("Up");
    }
}

class B extends A {
    void show() {
        System.out.println("Down");
    }
}

public class Upcasting {
    public static void main(String args[]) {
        A obj = new B();
        obj.show();
    }

}
