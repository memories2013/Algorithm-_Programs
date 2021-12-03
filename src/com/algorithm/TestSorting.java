package com.algorithm;

public class TestSorting {

	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		
		int array[] = {40,30,10,70,50,20,60};
		int [] sortedArray = sort.insertionSort(array);
		sort.displaySort(sortedArray);
	}
}