package com.String;

public class SortCharacterArrayUsingMapping {
	public static void main(String[] args) {
			char [] chArr = {'s', 'a', 's', 'd', 'e', 'f', 'a', 'a', 'f', 'g', 'z'};
//		total sc --> O(1) and tc -> O(n)
		sortArray(chArr);
		System.out.println("After mapping sorting Array is : ");
		printArray(chArr);
	}
	public static void sortArray(char [] chArr) {
//		Create FreMap
//    	sc --> O(n) and tc --> O(n)
		int[] fmap = createFrequencyMap(chArr);
//		Sort Array Using Frequency map
//		O(n)
		sortArrayUsingFrequencyMap(chArr, fmap);
	}
//	method for create frequencey map array
	public static int[] createFrequencyMap(char[] chArr) {
		int[] fmap = new int[256]; // bcz total character 256
		for(int i = 0; i < chArr.length; i ++) {
			int ascii = chArr[i]; // bcz its give 97 for 'a' ....
			fmap[ascii] ++;
		}
		return fmap;
	}
//	method for sort array using frequency map
	public static void sortArrayUsingFrequencyMap(char [] chArr,  int [] fmap) {
		int k = 0;
		for(int i = 0; i < fmap.length; i ++) {
			int val = i; // value coming coming 97, 98, ....
			int freq = fmap[i]; // how many times coming...
			for(int j = 0; j < freq; j ++) {
				chArr[k] = (char) (val); // bcz here coming 97,98....so we convert this character
				k ++;
			}
		}
	}
//	method for print Array
	public static void printArray(char [] arr) {
		for(char ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
}
