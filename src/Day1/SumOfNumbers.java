package Day1;

import java.util.Scanner;

public class SumOfNumbers 
{
	static int sumOfEvenNumbers(int start,int end)
	{
		int i,m=0; 
		
			for(i = start; i <= end; i++)
			{
				if(i % 2 == 0)
				{
					m = m + i;
				}
			}
			return m;
		}
	static int sumOfOddNumbers(int start, int end)
	{
		int j,n=0;
			
			for(j = start; j <= end; j++)
			{
				if(j % 2 != 0)
				{
					n = n + j;
				}
			}
			return n;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Even Sum ="+ sumOfEvenNumbers(a,b));
		System.out.println("Odd Sum ="+ sumOfOddNumbers(a,b));
		sc.close();
		
	}
}
