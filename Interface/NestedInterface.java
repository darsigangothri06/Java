interface Parent1 {
    void print();

    interface Parent2 {
        void hello();
    }
}

class Child implements Parent1.Parent2 {
    public void hello() {
        System.out.println("Implementing Nested Method");
    }
}

class Child1 implements Parent1 {
    public void print() {
        System.out.println("Implements print method");
    }
}

public class NestedInterface {
    public static void main(String args[]) {

        Parent1.Parent2 obj = new Child();
        obj.hello();

        Parent1 obj1 = new Child1();
        obj1.print();
    }
}
