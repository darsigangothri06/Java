class A
{
	void hello()
	{
		System.out.println("Hey, I'm Hello from A");
	}
}

class B extends A
{
	void hello()
	{
		System.out.println("Hey, I'm Hello from B");
	}
}

class C extends A
{
	void hello()
	{
		System.out.println("Hey, I'm Hello from C");
	}
}

class HierarchialInheritance
{
	public static void main(String args[])
	{
		B ob = new B();
		ob.hello();
		C oc = new C();
		oc.hello();
		A oa = new A();
		oa.hello();
		System.out.println("Again");
		ob.hello();
		oc.hello();
		oa.hello();
	}
}