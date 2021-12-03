package com.algorithm;

import java.util.Scanner;

public class TestSorting {
	
	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First String: ");
		String first = scan.nextLine();
		
		System.out.print("Second String: ");
		String second = scan.nextLine();
		
		AnagramString anagram = new AnagramString();
		anagram.anagram(first,second);
	}
}
