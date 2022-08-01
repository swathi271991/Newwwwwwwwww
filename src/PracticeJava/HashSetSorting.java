package PracticeJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method 1
	/*	HashSet hs = new HashSet<>();
		hs.add(1);
		hs.add(5);
		hs.add(8);
		hs.add(3);
		hs.add(2);
		
		TreeSet ts = new TreeSet<>(hs);
		ts.addAll(hs);
		
		System.out.println(ts); */
		
		//method 2
		HashSet hs = new HashSet<>();
		hs.add(1);
		hs.add(5);
		hs.add(8);
		hs.add(3);
		hs.add(2);
		
		List ls = new ArrayList<>(hs);
		Collections.sort(ls);
		System.out.println(ls);
		

	}

}
