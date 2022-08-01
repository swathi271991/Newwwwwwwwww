package PracticeJava;

import java.util.Scanner;

public class EvenOROdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int val = a%2;

			if(val == 0)
			{
				System.out.println(val);
				System.out.println(val/2);
				System.out.println("even");
			}
			else
			{   
			System.out.println(val);
			System.out.println(val/2);
			System.out.println("odd");
			}
             
		s.close();


	}

}
