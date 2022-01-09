class Parent {
    int a = 10;
}

class Child extends Parent {
    int b = 28;
}

public class InstanceOfOperator {
    public static void main(String args[]) {
        Parent obj = new Parent();
        System.out.println(obj instanceof Parent); // true
        System.out.println(obj instanceof Child); // false
        Child obj1 = new Child();
        System.out.println(obj1 instanceof Parent); // true
        System.out.println(obj1 instanceof Child); // true
    }
}
