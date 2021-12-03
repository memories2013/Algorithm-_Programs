package com.algorithm;

public class TestSorting {

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int array[] = {40,30,10,70,50,20,60,22,44};
		
		sort.mergeSort(array, 0, array.length - 1);
		sort.displaySort(array);
	}
}