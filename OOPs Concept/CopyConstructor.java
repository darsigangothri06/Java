public class CopyConstructor {
    public static void main(String args[]) {
        Subject sub = new Subject("Hi", "Hello");
        Subject copySub = new Subject(sub);
        System.out.println(copySub.a);
        System.out.println(copySub.b);
        /*
         * Although these two objects are identical, they exist in different locations.
         */
        if (sub == copySub) // comparing memory locations of both objects --- Expected output: False
            System.out.println("They are in same memory locations");
        else
            System.out.println("They are in different memory locations");
    }
}

class Subject {
    String a, b;

    Subject(String x, String y) {
        a = x;
        b = y;
    }

    Subject(Subject subject) {
        a = subject.a;
        b = subject.b;
    }
}
