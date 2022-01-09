class A {
    void display() {
        System.out.println("Hi");
    }
}

class B extends A {
    void display() // overriding
    {
        System.out.println("Bye");
    }
}

public class DynamicBinding {
    public static void main(String args[]) {
        A obj = new B(); // Dynamic binding
        obj.display();
    }

}
