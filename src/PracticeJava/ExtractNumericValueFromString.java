package PracticeJava;

public class ExtractNumericValueFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Swathi12345 is3456 good789 girl123464";
		
		s = s.replaceAll("[^\\d]", " ").trim();
		s = s.replaceAll(" +", "");
		System.out.println(s);
		
		

		
		
		
	}

}
