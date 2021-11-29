import java.util.Scanner;

/*
Abstract Method

Method which does not have it's body.
It is always declared in abstract class.
We just use abstract keywprd.

*/

abstract class ABSum
{
    abstract int sum(int a, int b);
}

class SumOperation extends ABSum // we have to do implementation
{
    int sum(int a, int b)
    {
        return a+b;
    }
}

public class AbstractMethod
{
    public static void main(String args[])
    {
        SumOperation obj = new SumOperation();
        int c = obj.sum(3,4);
        System.out.println("Sum is: " + c);
    }
}