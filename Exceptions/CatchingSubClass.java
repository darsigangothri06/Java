class Parent {
    void msg() {
        System.out.println("In Parent");
    }
}

class Child extends Parent {
    // void msg() throws IOException ---- ERROR ---- Here, IOException is not
    // declared in Parent method
    void msg() throws ArithmeticException {
        System.out.println(20 / 5);
    }
}

public class CatchingSubClass {
    public static void main(String args[]) {
        Child obj = new Child();
        obj.msg();
    }
}
