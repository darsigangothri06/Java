class A
{
	void hi()
	{
		System.out.println("Hi from A");
	}
}

class B
{
	void hello()
	{
		System.out.println("Hello from B");
	}
}

class C extends A,B
{
	void new()	
	{
		System.out.println("Im new from C");
	}
}

class MultipleInheritance
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.new();
		obj.hello();
		obj.hi();
	}
}