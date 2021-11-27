class CALL
{
    int data = 50;
    void change(CALL obj)
    {
        obj.data += 20;  // here, we are passing the object as a refernce
        // direct value data will be accessed here.
        // changes will be reflected to original instance variable
    }
}

public class  CallByReference
{
    public static void main(String args[])
    {
        CALL obj = new CALL();
        System.out.println("Before calling: " + obj.data);
        obj.change(obj); // passing the object as a parameter
        System.out.println("After calling: " + obj.data);
    }
}