public class StaticBinding {
    private void display() {
        System.out.println("Hi");
    }

    public static void main(String args[]) {
        StaticBinding obj = new StaticBinding();
        obj.display(); // static binding
    }
}
