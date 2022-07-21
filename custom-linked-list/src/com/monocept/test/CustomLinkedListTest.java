package com.monocept.test;

import com.monocept.model.CustomLinkedList;

public class CustomLinkedListTest {
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.addFirst(10);
		list.addLast(22);
		list.add(23);
		list.display();
        list.removeLast();
        list.remove();
		list.display();
	
	}

}
