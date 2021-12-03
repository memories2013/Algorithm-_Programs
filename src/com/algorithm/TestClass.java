package com.algorithm;

import java.util.Arrays;

public class TestClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"hi", "welcome", "two", "bridge", "labz", "fellow", "ship", "pro", "gram"};
		BinarySearch binary = new BinarySearch();
		Arrays.sort(array);
		
		binary.binarySearch(array, 0, array.length, "hi");
	}

}