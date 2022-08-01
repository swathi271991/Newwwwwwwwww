package PracticeJava;

public class SpaceAndNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int word = 1;
		String str = "I am learning Java Coding";
		
        for(int i =0; i<str.length(); i++)
        {
        	if(str.charAt(i)== ' ')
        	{
        		
				word++;
        	}
        }

        System.out.println("words" +word);
        System.out.println("spaces" +(word-1));
	}

}
