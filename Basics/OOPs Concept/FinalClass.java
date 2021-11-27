final class FINAL
{
    void display()
    {
        System.out.println("This is final class");
    }
}

class Inherit extends FINAL  // cannot inherit from final FINAL
{
    void hello()
    {
        System.out.println("I cannot inherit final class");
    }
}
public class FinalClass
{
    public static void main(String args[])
    {
        Inherit obj = new Inherit();
        obj.display();
    }
}