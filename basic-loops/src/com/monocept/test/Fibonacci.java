package com.monocept.test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int i=0;
		int firstTerm=0;
		int secondTerm=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		System.out.println("Fibonacci Series till "+number);
		
		while(i<=number) {
			System.out.println(firstTerm+", ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			
			i++;
		}

	}

}
