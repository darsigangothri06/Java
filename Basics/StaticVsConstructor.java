class Check
{
	Check()
	{
		System.out.println("Iam Constructor");
	}
	
	static	
	{
		System.out.println("Hi, I'm Static method");
	}
}

class StaticVsConstructor
{
	public static void main(String args[])
	{
		Check obj = new Check();
	}
}