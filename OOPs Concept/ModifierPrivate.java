/*

We cannot access a private variable/method in other class.
We have to create a public class and call the private method inside it.
Then, we can get our output.

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

*/

class PRIVATE {
	private void display() {
		System.out.println("Hi, I'm Private method.");
	}

	public void Call() {
		display();
	}
}

class ModifierPrivate {
	public static void main(String args[]) {
		PRIVATE obj = new PRIVATE();
		obj.Call();
	}
}