package com.algorithm;

public class TestSorting {

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		
		int array[] = {40,30,10,70,50,20,60,22,44};
		int [] sortedArray = sort.bubbleSort(array);
		sort.displaySort(sortedArray);
	}
}