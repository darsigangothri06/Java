class THIS
{
    int value = 5;
    void display()
    {
        /*
        System.out.println(value); //5
        Here, we get the value 5 ------ By default the compiler takes value as this.value
        */
        int value = 34;  // we are creating another variable with same name.
        // System.out.println(value);    -------  Here, we get the value 34.
        // To access the value 5 (value of instance variable for current object) we use this keyword
        System.out.println(this.value);  
    }
}

public class ThisKeyword
{
    public static void main(String args[])
    {
        THIS obj = new THIS();
        obj.display();
    }
}