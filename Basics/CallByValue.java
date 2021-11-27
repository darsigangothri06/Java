class Operation
{
    int data = 20;
    void change(int data) // this variable data is local to this function only
    {
        data += 10; // this change does not reflect to main method.
    }
}

public class CallByValue
{
    public static void main(String args[])
    {
        Operation obj = new Operation();
        System.out.println("Before calling: " + obj.data);
        obj.change(20);
        System.out.println("After calling: " + obj.data);
    }
}