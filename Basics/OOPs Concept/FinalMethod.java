class Parent
{
    final void display()
    {
        System.out.println("I'm in parent class");
    }
}

class Child extends Parent
{
    void display()
    {
        System.out.println("I'm in child class");
    }
}

public class FinalMethod
{
    public static void main(String args[])
    {
        Child obj = new Child();
        obj.display(); //error
    }
}