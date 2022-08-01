package PracticeJava;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Before Reversing the String  is  " +name);
		
        char c[] = name.toCharArray();
       
        for(int i = (c.length)-1; i>=0; i--)
        {
        	System.out.print(c[i]);
        	
        	
        }
        System.out.println(" is the String after Reversal");
        
       s.close();
        
	}

}
