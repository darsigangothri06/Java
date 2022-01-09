class A {
    int var;

    A() {
        // super(); ------ INVISIBLE CALLING
        System.out.println("In");
        System.out.println(var);
        System.out.println("Out");
    }

    {
        // This block will be executed first
        System.out.println("In Block");
        var = 100;
        System.out.println("Out Block");
    }
}

public class InstanceInitialiser {
    public static void main(String args[]) {
        A obj = new A();
    }
}
