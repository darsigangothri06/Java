class A
{
	protected int a = 10;
	protected void msg()
	{
		System.out.println("Protected");
	}
}
class ProtectedMsg extends A
{
	public static void main(String args[])
	{
		ProtectedMsg obj = new ProtectedMsg();
		obj.msg();
	}
}