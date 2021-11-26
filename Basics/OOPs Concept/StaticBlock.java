class Hello
{
	static int a = 6;
	static void msg()
	{
		System.out.println("I'm Message");
	}

	static
	{
		System.out.println("Hey, I'm from Static block");
	}
}

class StaticBlock
{
	public static void main(String args[])
	{
		Hello check = new Hello();
		check.msg();
	}
}