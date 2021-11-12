import java.util.*;
class QualifyRace
{
	public static void main(String args[])
	{
		double speed1, speed2, speed3, speed4, speed5,avg;
		Scanner Speeds = new Scanner(System.in);
		System.out.println("Enter speed1: ");
		speed1 = Speeds.nextInt();
		System.out.println("Enter speed2: ");
		speed2 = Speeds.nextInt();
		System.out.println("Enter speed3: ");
		speed3 = Speeds.nextInt();
		System.out.println("Enter speed4: ");
		speed4 = Speeds.nextInt();
		System.out.println("Enter speed5: ");
		speed5 = Speeds.nextInt();
		
		avg = (speed1 + speed2 + speed3 + speed4 + speed5)/5;
		if (speed1 >= avg) System.out.println("Player 1 is Qualified and his speed is " + speed1 );
		if (speed2 >= avg) System.out.println("Player 2 is Qualified and his speed is " + speed2 );
		if (speed3 >= avg) System.out.println("Player 3 is Qualified and his speed is " + speed3 );
		if (speed4 >= avg) System.out.println("Player 4 is Qualified and his speed is " + speed4 );
		if (speed5 >= avg) System.out.println("Player 5 is Qualified and his speed is " + speed5 );
	}
}