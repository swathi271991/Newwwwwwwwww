package PracticeJava;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//armstrong = no of digits * (each digit of the num)-> if (actaul no = armstronG)
		//153 = 1*3 + 5*3+3*3 = 153
		
		double arm =0 , actual;
		Scanner s= new Scanner(System.in);
		int no = s.nextInt();
		int noofdigits = s.nextInt();
		actual = no;
		
		System.out.println("Hi");
		
		while(no>0)
		{
			int r = no%10;
			arm = arm + Math.pow(r, noofdigits);
			no = no/10;
			
		}
		System.out.println(arm);
		
		if(actual==arm)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not ArmStrong ");
		}
		
	}

}
