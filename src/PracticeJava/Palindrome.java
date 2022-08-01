package PracticeJava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if actual no = reverse of same no then palindrom
		
		//121 = 121(after reverse)
		
		int palndrm = 0;
		Scanner s= new Scanner(System.in);
		int no = s.nextInt();
		int actual = no;
		
		while(no>0)
		{
			int r= no%10;
		    palndrm = palndrm*10+r;
		    no = no/10;
		    
			System.out.println(palndrm);
			
		}
		if(actual == palndrm)
		{
			System.out.println("Palindrome");
		}
	
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
