class OverLoad
{
	int a,b,c;
	void add()
	{
		System.out.println("I have no parameters");
	}
	
	void add(int x)
	{
		a = x;
		System.out.println("I have only one parameter");
	}
	
	void add(int x, int y)
	{
		a = x;
		b = y;
		System.out.println("I have two parameters");
	}
	
	void add(int x, int y, int z)
	{
		a = x;
		b = y;
		c = z;
		System.out.println("I have three parameters");
	}

	void display()
	{
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Value of c is "+c);
	}
}

class MethodOverLoading
{
	public static void main(String args[])
	{
		OverLoad try1 = new OverLoad();
		try1.add();
		try1.display();

		OverLoad try2 = new OverLoad();
		try2.add(6);
		try2.display();

		OverLoad try3 = new OverLoad();
		try3.add(6,9);
		try3.display();

		OverLoad try4 = new OverLoad();
		try4.add(6,9,8);
		try4.display();
	}
}