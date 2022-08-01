package PracticeJava;

import java.util.ArrayList;
import java.util.Iterator;

public class listDemo {
	
	public static void main(String args[])
	{
	
	ArrayList<Object> al = new ArrayList<Object>();
	al.add("swathi");
	al.add(1);
	al.add("SVECW");
	al.add(true);
	al.add('A');
	
	System.out.println(al);
	
	Iterator<Object> itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	for(Object i : al)
	{
		System.out.println(i);
	}
	
	}

}
