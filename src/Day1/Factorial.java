package Day1;

public class Factorial 
{
	static int calculateFactorial(int n)
	{
		if(n == 0)
			return 1;
		else
			return (n*calculateFactorial(n-1));
	}
	public static void main(String args[])
	{
		int fact = 1;
		int number = 5;
		fact = calculateFactorial(number);
		System.out.println("factorial of " +number+ " is:"+fact);
	}
}
