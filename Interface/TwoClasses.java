interface Parent1 {
    void draw();
}

class Rectangle implements Parent1 {
    public void draw() {
        System.out.println("Drawing Rectangle");
        ;
    }
}

class Circle implements Parent1 {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class TwoClasses {
    public static void main(String args[]) {
        Parent1 obj = new Circle();
        obj.draw();

        Parent1 obj1 = new Rectangle();
        obj1.draw();
    }
}
