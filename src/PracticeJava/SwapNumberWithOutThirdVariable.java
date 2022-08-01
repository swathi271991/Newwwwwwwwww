package PracticeJava;

import java.util.Scanner;

public class SwapNumberWithOutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a  = s.nextInt();
		int b = s.nextInt();
		
		System.out.println("Before Swap" +a);
		System.out.println("Before Swap" +b);
		
		a = a+b; 
		b = a-b; 
		a = a-b; 
		
		System.out.println("After Swap" +a);
		System.out.println("After Swap" +b);
		
		s.close();

	}

}
