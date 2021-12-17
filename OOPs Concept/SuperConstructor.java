class Parent {
    int variable;

    Parent(int raw) {
        variable = raw;
        System.out.println("In constructor, variable is: " + variable);
    }

    void DISPLAY() {
        System.out.println("Value of variable from Parent is: " + variable);
    }
}

class Child extends Parent {
    int x;

    Child(int a) {
        super(a);
        x = a;
        System.out.println("Inside Child Cons: " + x);
    }

    void DISPLAY() {
        System.out.println("Inside Child Display: " + x);
    }
}

class SuperConstructor {
    public static void main(String args[]) {
        Parent objp = new Parent(100);
        objp.DISPLAY();
        Child objc = new Child(200);
        objc.DISPLAY();

        System.out.println();
        objp.DISPLAY();
    }
}