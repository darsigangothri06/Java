class OverLoad
{
	int a,b,c;
	OverLoad()
	{
		System.out.println("I have no parameters");
	}
	
	OverLoad(int x)
	{
		a = x;
		System.out.println("I have only one parameter");
	}
	
	OverLoad(int x, int y)
	{
		a = x;
		b = y;
		System.out.println("I have two parameters");
	}
	
	OverLoad(int x, int y, int z)
	{
		a = x;
		b = y;
		c = z;
	}

	void display()
	{
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Value of c is "+c);
	}
}

class ConstructorOverLoading
{
	public static void main(String args[])
	{
		OverLoad try1 = new OverLoad();
		try1.display();
		OverLoad try2 = new OverLoad(6);
		try2.display();
		OverLoad try3 = new OverLoad(6,9);
		try3.display();
		OverLoad try4 = new OverLoad(6,9,8);
		try4.display();
	}
}