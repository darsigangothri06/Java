interface Parent1 {
    default void print() {
        System.out.println("Parent1");
    }
}

interface Parent2 {
    default void print() {
        System.out.println("Parent2");
    }
}

// ERROR - class Child inherits unrelated defaults for print() from types
// Parent1 and Parent2
class Child implements Parent1, Parent2 {
    public void hello() {
        System.out.println("Child");
    }
}

public class InterfaceInter {
    public static void main(String args[]) {
        Child obj = new Child();
        obj.print();
    }
}
