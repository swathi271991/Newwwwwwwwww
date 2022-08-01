package PracticeJava;

import java.io.Console;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EachCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "SASSAS";
	int count =0;
	
	char sstring1[] = str.toCharArray();

	
	 for(int i = 0; i <sstring1.length; i++) {  

          for(int j = i+1; j <sstring1.length; j++) {  
              if(sstring1[i] == sstring1[j] && sstring1[i] != ' ') {  
                  count++;  
                  //Set string1[j] to 0 to avoid printing visited character 
                  System.out.println(sstring1[j]);
                  System.out.println(sstring1[i]);
                  sstring1[j] = '0';  
                  System.out.print(sstring1[j]);
              }  
          }  
          //A character is considered as duplicate if count is greater than 1  
          if(count > 1 && sstring1[i] != '0')  
           System.out.println(sstring1[i]);  
      }  
  }  
}  
