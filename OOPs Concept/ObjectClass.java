class A {
    void show() {
        System.out.println("a");
    }
}

public class ObjectClass {
    public static void main(String args[]) {
        A l = new A();
        A k = new A();
        System.out.println(l.hashCode());
        System.out.println(l.toString());
        System.out.println(l.getClass()); // A
        System.out.println(k.equals(l)); // F
        k = l;
        System.out.println(k.equals(l)); // T
    }

}
