public class  D
{
	public int a = 10;
	public void msg()
	{
		System.out.println("I'm in message");
	}
}

class Modifiers
{
	public static void main(String args[])
	{
		D obj = new D();
		System.out.println(obj.a);
		obj.msg();
	}
}