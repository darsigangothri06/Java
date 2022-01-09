interface Parent {
    void display();
}

interface Parent2 {
    void hello();
}

class Child implements Parent, Parent2 {
    public void display() {
        System.out.println("hi");
    }

    public void hello() {
        System.out.println("Two");
    }
}

public class MultipleInherit {
    public static void main(String args[]) {
        Child obj = new Child();
        obj.display();
        obj.hello();
        // Parent obj1 = new Parent(); -- error - Parent is abstract; cannot be
        // instantiated
    }
}
