package PracticeJava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long rev = 0 , r;
		Scanner s = new Scanner(System.in);
		long no = s.nextLong(); //12345
		
		System.out.println("Before Reversing" +no);
		
		while(no>0)
		{
		r = no%10; 
		rev = rev*10 + r;
		no = no/10;
		
		
		System.out.println("After Reversing" +rev);
		}

	}

}
