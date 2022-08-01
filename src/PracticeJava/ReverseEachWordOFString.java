package PracticeJava;

public class ReverseEachWordOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "swathi is good girl";
		
		String words[] = s.toLowerCase().split(" ");
		
		String reverseString = "";
		
		for(int i =0; i<words.length; i++)
		{
			String word = words[i];
			String reverseword = "";
			
			for(int j = (word.length())-1; j>=0; j--)
			{
				char wordvar = word.charAt(j);
				reverseword = reverseword+wordvar;
			}
			reverseString = reverseString+reverseword + " ";
		}
		
		System.out.print(s);
		System.out.println("------------------------------");
		System.out.println(reverseString);
	}

}
