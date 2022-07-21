package com.monocept.model;

public class CustomLinkedList {
	Node head;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void addAtPosition(int data, int pos) {
		Node newNode = new Node(data);
		if (head == null && pos == 0)
			head = newNode;

		if (head != null && pos == 0) {
			newNode.next = head;
			head = newNode;
		}

		Node current = head;
		Node prev = null;

		int i = 0;
		while (i < pos) {
			prev = current;
			current = current.next;
			if (current == null)
				break;
			i++;
		}
		newNode.next = current;
		prev.next = newNode;

	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("Linked list is empty..");
			return;
		}
		head = head.next;
	}

	public void removeLast() {
		if (head == null) {
			System.out.println("Linked list is empty..");
			return;
		}

		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}

	public void remove() {
		if (head == null) {
			System.out.println("Linked list is empty..");
			return;
		}

		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

}
