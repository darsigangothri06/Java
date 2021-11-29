package Mathematics;
import java.util.*;

public class ReverseOfNumber
{
	public int Reverse()
	{
		int number, rev = 0, rem;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		number = num.nextInt();
	
		while (number > 0)
		{
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}

		return rev;
	}
}