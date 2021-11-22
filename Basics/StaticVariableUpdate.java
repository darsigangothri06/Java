class Update
{
	static int count;
	int i;
	void hello()
	{	
		count++;
		i = count;
		System.out.println("Count is " + count);
		System.out.println("i is "+i);
	}
}

class StaticVariableUpdate
{
	public static void main(String args[])
	{
		Update obj = new Update();
		obj.hello();
		Update obj1 = new Update();
		obj1.hello();
		Update obj2 = new Update();
		obj2.hello();
	}
}