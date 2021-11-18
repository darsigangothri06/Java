import java.io.*;
import java.util.*;
class ClassMech
{ 
	int a = 98;
	void message()
	{
		System.out.println("Hi, I'm Message");
	}
	public static void main(String args[])
	{
		ClassMech obj = new ClassMech();
		System.out.println(obj.a);
		obj.message();
	}
}