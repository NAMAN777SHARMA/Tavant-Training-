package Day1;

import java.util.Scanner;

public class MarkValidator {
	
	public static String isPass(int a)
	{
		if (a >= 40)
			return "Pass";
		else
			return "Fail";
	}
	
	public static String markGrade(int a)
	{
		if(a >= 90)
			return "grade A";
		else if(a >= 75 && a <90)
			return "grade B";
		else if(a >= 60 && a < 75)
			return "grade C";
		else
			return "grade D";
	}
	 
	public static void main(String[] args){
		{
			Scanner sc = new Scanner(System.in);
			int a;
			System.out.println("grade = ");
			a = sc.nextInt();
			System.out.println(isPass(a));
			System.out.println(markGrade(a));
			sc.close();
		}
	}
}
