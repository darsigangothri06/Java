class Parent
{
    void display()
    {
        System.out.println("I'm From Parent Class");
    }
}

class Child1 extends Parent
{
    void display1()
    {
        System.out.println("I'm from Child1");
    }
}

class Child2 extends Child1
{
    void display2()
    {
        System.out.println("I'm from Child2");
    }
}

public class MultiLevelInheritance
{
    public static void main(String args[])
    {
        Child2 obj = new Child2();
        obj.display2();
        obj.display1();
        obj.display();
    }
}