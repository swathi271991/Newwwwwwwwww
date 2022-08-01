package PracticeJava;

public class TotalOCcuranceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java is java again java again";
		
		int count = 1;
		
		for(int i =0; i<s.length(); i++)
		{
		     if(s.charAt(i)=='a')
		     {
		    	 count++;
		    	 
		     }
		    
		}
		 System.out.println(count);
		
		
	}

}
