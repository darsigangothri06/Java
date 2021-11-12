class RootsOfQuadraticEquation
{
	public static void main(String args[])
	{
		int a = 4, b = 0, c = 1;
		double D;
		double root1, root2;
		D = b*b - 4*a*c;
		if (D == 0) 
		{
			System.out.println("Discriminant is zero");
			root1 = root2 = -b/(2.0*a);
			System.out.println(root1);
			System.out.println(root2);
		}	
		else if (D > 0) 
		{
			System.out.println("Discrimanant is greater than zero");
			root1 = -b + Math.sqrt(D);
			root2 = -b - Math.sqrt(D);
			System.out.println(root1);
			System.out.println(root2);
		}
		else 
		{
			System.out.println("Discriminant is less than zero");
			double rl, img;
			rl = -b/2*a;
			img = Math.sqrt(-D)/2*a;
			System.out.println("Real part is " + rl + " and Imaginary part is " + img);
		}
	}
}