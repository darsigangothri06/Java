class B
{
	private int a = 10;
	private void msg()
	{
		System.out.println("I'm private method");
	}
}

class ModifiersPrivate
{
	public static void main(String args[])
	{
		B obj = new B();
		System.out.println(obj.a);
		obj.msg();
	}
}