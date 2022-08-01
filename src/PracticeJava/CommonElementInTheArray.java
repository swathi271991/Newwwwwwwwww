package PracticeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementInTheArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr1[] = {"Article", "for", "Geeks","for"};
		String arr2[] = {"Article", "Geeks"};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arraydemo(arr1, arr2);
		}

	private static void arraydemo(String[] arr1, String[] arr2) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ls = new ArrayList<String>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
 
                    // add common elements
                    ls.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : ls) {
            System.out.print(i + " ");
        }
    }
 

}
