interface Parent {
    void print();
}

class Child implements Parent {
    public void print() {
        System.out.println("Hi, This is interface example");
    }
}

public class InterfaceSimple {
    public static void main(String args[]) {
        Child obj = new Child();
        obj.print();

        Parent obj1 = new Parent(); // Parent is abstract and cannot inherit
        obj1.print();
    }
}
