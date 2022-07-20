package com.monocept.test;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<String>();
		names.add("Vishnu");
		names.add("Vishal");
		names.add("Akhil");
		
		names.add(3, "Swapnil");
		System.out.println(names);
		LinkedList<String> names2=new LinkedList<String>();
		names2.add("Mayur");
		names2.add("Akash");
		
		names.addAll(names2);
		System.out.println(names);
		names.addFirst("Virat");
		names.addLast("Rohit");
		System.out.println(names);
		System.out.println(names.contains("Virat"));
		System.out.println(names.element());
		System.out.println(names.get(5));
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		System.out.println(names.indexOf("Mayur"));
		names.add("Mayur");
		System.out.println(names.lastIndexOf("Mayur"));
		
		names.offer("Ajinkya");
		System.out.println(names);
		names.offerFirst("Rishabh");
		System.out.println(names);
		names.offerLast("Bhuvi");
		System.out.println(names);
		
		System.out.println(names.peek());
		System.out.println(names.peekFirst());
		System.out.println(names.peekLast());
		
		names.poll();
		System.out.println(names);
		names.pollFirst();
		System.out.println(names);
		names.pollLast();
		System.out.println(names);
		
		System.out.println(names.size());
		names.clear();
		System.out.println(names);
		

	}

}
