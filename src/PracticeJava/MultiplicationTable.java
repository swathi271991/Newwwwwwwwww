package PracticeJava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		Scanner sc = new Scanner(System.in);
		int mulno = sc.nextInt();
		
		for(int i = 1; i<=10; ++i)
		{
			result = mulno * i;
			System.out.println(mulno+ "*" +i+ "=" +result);
			
		}
		
		

	}

}
