package Mathematics;
import java.util.Scanner;

public class Factorial
{	
	public int FindFact()
	{
		int Fact = 1,i,number;
		System.out.println("Enter a number: ");
		Scanner num = new Scanner(System.in);
		number = num.nextInt();
	
		for(i = number; i > 0; i--)
		{
			Fact *= i;
		}

		return Fact;
	}
}