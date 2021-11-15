class New
{	
	private static int k = 20;
	
	private void msg()
	{
		System.out.println("I'm a private method");
	}
}

class PrivateClass
{
	public static void main(String args[])
	{
		New obj = new New();
		System.out.println(k);
		obj.msg();
	}
}