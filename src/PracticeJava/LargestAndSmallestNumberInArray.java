package PracticeJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5, 3, 7, 2, 10, 6, 4};
		int temp = 0;
		
		for(int i= 0; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print(" ");
		
		for(int i = 0; i< a.length; i++)
		{
			System.out.print(a[i] +" ");
			
		}
		System.out.println();
		System.out.println("Smallest Number in array is " +a[0]);
		System.out.println("Largest Number in array is " +a[a.length-1]);
		
	}

}
