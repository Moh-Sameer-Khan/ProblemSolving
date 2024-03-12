package com.String;

public class StringSortUsingMapping {
	public static void main(String[] args) {
		  String str = "sameer";
//		total sc --> O(n) and tc -> O(n)
		  String resStr = sortString(str);
		  System.out.println("After Mapping sort String is : " + resStr);
	}
	public static String sortString(String str) {
//		convert into Char Array
		char [] chArr = stringToCahrArray(str); // O(n) and O(n)
//		SORT ARRAY using Mapping
		sortArray(chArr); // O(n) and O(1)
//		CONVERT CHARACTER TO STRING
		String ans = charArrayToString(chArr); // O(n) and O(n)
		return ans;
	}
//	string to character array method
	public static char[] stringToCahrArray(String str) {
		char [] chArr = new char[str.length()];
		for(int i = 0; i < str.length(); i  ++) {
			chArr[i] = str.charAt(i);
		}
		return chArr;
	}
//	character array to string method
	public static String charArrayToString(char [] chArr) {
		int len = chArr.length;
//		here character array to String builder
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len; i ++) {
			sb.append(chArr[i]);
		}
//		here string builder to String bcz we need string
		String ans = String.valueOf(sb);
//		or but value of is better
//		String ans = sb.toString();
		return ans;
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
