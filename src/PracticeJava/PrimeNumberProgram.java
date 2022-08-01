package PracticeJava;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int no = s.nextInt();

		if(primeLogic(no))
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a prime Number");
		}
		//prime number is the one which is divisible of its own. (2,3,5,7..)
		s.close();
	}

	public static boolean primeLogic(int n)

	{
		if(n<=1) //7
		{
			return false;
		}
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		{
			return true;
		}

	}
}
