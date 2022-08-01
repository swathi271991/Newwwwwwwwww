package PracticeJava;

import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//0 1 1 2 3 5 8 13.....

		
		
		
		Scanner s= new Scanner(System.in);
		int n = s.nextInt(); //7
		
		int first = 0;
		int second = 1;
		int next;
		
		for(int i=0; i<=n; i++) //5
		{
			
			
			System.out.println(first);//0, 1, 1,2, 3, 5, 8, 13
		     next = first+second; //1,2, 3,5, 8, 13
		     first = second; //1 1, 2, 3, 5, 8
		     second  = next;//1 2, 3, 5, 8, 13
	   
		}
	
	}

}
