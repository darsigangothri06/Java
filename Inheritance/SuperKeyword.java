class Parent
{
    void display()
    {
        System.out.println("Hey, I'm Display from Parent");
    }
}

class Child extends Parent
{
    void display()
    {
        System.out.println("Hey, I'm Display from Child");
        System.out.println("I'm calling my parent class display method: ");
        super.display();
    }
}

public class SuperKeyword
{
    public static void main(String args[])
    {
        Child obj = new Child();
        obj.display();
    }
}