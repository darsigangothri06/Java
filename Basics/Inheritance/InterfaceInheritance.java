interface Parent1
{
	default void method1()
	{
		System.out.println("This is Parent1");
	}
}

interface Parent2
{
	default void method2()
	{
		System.out.println("This is Parent2");
	}
}

class Child implements Parent1, Parent2
{
	void show()
	{
		System.out.println("This is child class");
	}
	public void method1()
	{
		System.out.println("This is Method1 from child class");
		Parent1.super.method1();
	}
	public void method2()
	{
		System.out.println("This is Method2 from child class");
		Parent2.super.method2();
	}
}

class InterfaceInheritance
{
	public static void main(String args[])
	{
		Child obj = new Child();
		obj.show();
		obj.method1();
		obj.method2();
	}
}