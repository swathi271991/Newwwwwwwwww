package PracticeJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Object> hs = new HashMap<>();
		hs.put("Name", "swathi");
		hs.put("Id", 1);
		hs.put("College", "DXC");
		
		for(Map.Entry<String, Object> entry : hs.entrySet())
		{
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
			System.out.println(" ");
			
			System.out.println(entry);
		}
		
		
		

	}

}
