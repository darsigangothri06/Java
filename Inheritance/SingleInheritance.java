class Parent
{
    void display()
    {
        System.out.println("I'm from Parent Class");
    }
}

class Child extends Parent
{
    void display1()
    {
        System.out.println("Hi, I'm from Child Class");
    }
}

public class SingleInheritance
{
    public static void main(String args[])
    {
        Child obj = new Child();
        obj.display();
        obj.display1();
    }
}