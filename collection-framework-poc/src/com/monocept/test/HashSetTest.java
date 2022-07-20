package com.monocept.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet<String>();
		names.add("Vishal");
		names.add("Vishnu");
		names.add("Rohit");
		names.add("Vishal");
		System.out.println(names);
		System.out.println(names.contains("Vishal"));
		System.out.println(names.isEmpty());
		names.remove("Vishnu");
		System.out.println(names);
		System.out.println(names.size());
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		names.clear();
		System.out.println(names);

	}

}
