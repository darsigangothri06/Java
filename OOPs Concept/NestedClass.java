class Outer {
    int first, second;

    Outer(int a, int b) {
        first = a;
        second = b;
    }

    int Outer_sum() {
        return first + second;
    }

    void Outer_display() {
        Inner obj = new Inner();
        obj.Calculate();
    }

    class Inner {
        void Calculate() {
            System.out.println("Sum is " + Outer_sum());
        }
    }
}

public class NestedClass {
    public static void main(String args[]) {
        Outer obj1 = new Outer(4, 6);
        obj1.Outer_display();
    }
}
