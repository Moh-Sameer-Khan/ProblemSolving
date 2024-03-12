package com.String;

/// Given
//size			count
//10			4
//8				3
//9				3
//2				5
//4				6
//Output placed in sorted order ??

public class MappingEx1 {
	public static void main(String[] args) {
		int [] count = {4, 3, 3, 5, 6}; // find size after sum
		int [] fmap = {0, 0, 5, 0, 6, 0, 0, 0, 3, 3, 4}; // here given freuncy Map
//		total sc --> O(1) and tc -> O(n)
		int size = sum(count);
		int[] nArr = new int[size]; 
		sortArrayUsingFrequencyMap(nArr, size, fmap);
		System.out.println("After mapping sorting Array is : ");
		printArray(nArr);
	}

//	method for sort array using frequency map
	public static void sortArrayUsingFrequencyMap(int[] nArr, int size , int [] fmap) {
		int k = 0; // for traversal array
		// O(n)
		for(int i = 0; i < fmap.length; i ++) { // traversal at fmap 
			int val = i; // here value
			int freq = fmap[i]; // count or freq
			// here not o(n) bcz its depends on outer loop and its not going n times
			for(int j = 0; j < freq; j ++) { //for how many times freq
				nArr[k] = val;
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
////	method for finding min value
//	public static void findMin(int [] arr) {
//		int min = Integer.MAX_VALUE;
//		for(int i = 0; i < arr.length; i ++) {
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min);
//	}
////	method for finding max value
//	public static void findMax(int [] arr) {
//		int max = Integer.MIN_VALUE;
//		for(int i = 0; i < arr.length; i ++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
//	}
	public static int sum(int[] count) {
		int sum = 0;
		for(int i = 0; i < count.length; i ++) {
			sum = sum + count[i];
		}
		return sum;
	}
}
