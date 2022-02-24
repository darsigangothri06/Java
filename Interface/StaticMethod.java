interface St {
    static void show() {
        System.out.println("hello");
    }

    void print();
}

class B implements St {
    void hi() {
        System.out.println("hi");
    }

    public void print() {
        System.out.println("hi");
    }
}

public class StaticMethod {
    public static void main(String args[]) {
        B obj = new B();
        obj.hi();
        obj.print();
        St.show();
    }
}
