package PracticeJava;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		
		while(no>0)
		{
			int r = no%10;
			sum = sum+r;
			no = no/10;
			
		}
		
		System.out.println(sum);
	}

}
