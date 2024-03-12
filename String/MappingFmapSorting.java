package com.String;

public class MappingFmapSorting {
	public static void main(String[] args) {
		int [] oArr = {2, 2, 0, 0, 1, 4, 1, 0, 0, 3}; 
//		total sc --> O(1) and tc -> O(n)
		sortArray(oArr);
		System.out.println("After mapping sorting Array is : ");
		printArray(oArr);
	}
//	method for sorting 
	public static void sortArray(int[] arr) {
//		Create FreMap
//    	sc --> O(n) and tc --> O(n)
		int[] fmap = createFrequencyMap(arr);
//		Sort Array Using Frequency map
//		O(n)
		sortArrayUsingFrequencyMap(arr, fmap);
	}
//	method for create Frequency map
	public static int [] createFrequencyMap(int [] arr) {
//		sc --> O(n) and tc --> O(n)
		int [] fmap = new int [10]; // bcz value is range 0 - 9 so 10 use
		for(int i = 0; i < arr.length; i ++) { // for oArr index traversal
			fmap[arr[i]] ++; /// fmap counting / frequency
		}
		return fmap;
	}
//	method for sort array using frequency map
	public static void sortArrayUsingFrequencyMap(int[] arr, int [] fmap) {
		int k = 0; // for traversal array
		// O(n)
		for(int i = 0; i < fmap.length; i ++) { // traversal at fmap 
			int val = i; // here value
			int freq = fmap[i]; // count or freq
			// here not o(n) bcz its depends on outer loop and its not going n times
			for(int j = 0; j < freq; j ++) { //for how many times freq
				arr[k] = val;
				k ++;
			}
		}
	}
//	method for print Array
	public static void printArray(int [] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
}
