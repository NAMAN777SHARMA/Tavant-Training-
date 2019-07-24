package Day1;

import java.util.Scanner;

public class MarkValidatorCase
{
	public static String markGrade(int a)
	{
		for(int i=1; i<=4; i++)
		{
			switch(i)
			{
			case 1:
				if(a >= 90)
					return "grade A";
				break;
			
			case 2:
				if(a >= 75 && a < 90)
					return "grade B";
				break;
			
			case 3:
				if( a >= 60 && a < 75)
					return "grade C";
				break;
				
			case 4:
				if(a < 60)
					return "grade D";
			}
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Grade = ");
		a = sc.nextInt();
		System.out.println(markGrade(a));
		sc.close();
	}
}
