package com.monocept.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {
		Deque<String> names=new ArrayDeque<String>();
		names.add("Vishnu");
		names.add("Vishal");
		names.addLast("Vijay");
		names.addFirst("Ajinkya");
		System.out.println(names);
		
		names.poll();
		System.out.println(names);
		names.pollLast();
		System.out.println(names);
		names.offerLast("Rohit");
		System.out.println(names);
		System.out.println(names.size());
		names.clear();
		System.out.println(names);

	}

}
