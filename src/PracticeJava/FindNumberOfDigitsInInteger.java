package PracticeJava;

import java.util.Scanner;

public class FindNumberOfDigitsInInteger {

	public static void main(String[] args) {
		

		int count = 0;
		
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		
		for(int i =0; i<no; i++)
		{
			no = no%10;
			count++;
		}
		
		System.out.println(count);
		s.close();
		
		
		
	}

}
