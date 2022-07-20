package com.monocept.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Vishnu");
		names.add("Vishal");
		names.add("Ajay");
		names.add("Ajinkya");
		names.add("Mayur");
		names.add("Akhil");
		names.add(4, "Hari");
		System.out.println(names);
		ArrayList<String> names2=new ArrayList<String>();
		
		names2.add("Shinde");
		names2.add("Bhole");
		names.addAll(names2);
		
		System.out.println(names);

		System.out.println(names.get(3));
		System.out.println(names.isEmpty());
		
		System.out.println(names.contains("Vishnu"));
		System.out.println(names.indexOf("Vishal"));
		names.set(6, "Rahul");
		System.out.println(names);
		System.out.println("Size :"+names.size());
		names.remove(2);
		System.out.println(names);
		names.remove("Mayur");
		System.out.println(names);
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		names.clear();
		System.out.println(names);
		

	}

}
