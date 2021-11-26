class A
{
	private A()
	{
		System.out.println("Constructor Invoked");
	}
}

class PrivateConstructor
{
	public static void main(String args[])
	{
		A obj = new A(); //error
	}
}