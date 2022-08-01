package PracticeJava;

import java.util.Scanner;

public class fibonacciDiffMethods {

	public static void main(String[] args) {
		
		int first = 0; 
		int second = 1; 
		int next , i=1;
		
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    
	  //  while(i<=n)
	  //  {
	    	
	    	for(i=1; i<=n; i++)
	    	{
	    	System.out.print(first +" ");
	    	
	    	next = first+second;
	        first = second;
	        second = next;
	    }
		//i++;
	//}

	}

}
