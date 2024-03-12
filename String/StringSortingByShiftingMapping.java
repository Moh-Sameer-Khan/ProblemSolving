package com.String;

public class StringSortingByShiftingMapping {
	public static void main(String[] args) {
//		tc -- O(n) and sc -- O(n) -- total complexity
		
		String str = "geekster"; 

		sortString(str);
	}
	public static void sortString(String str) {
//		converting string into character Array
		char [] chArr = covertStringToCharArr(str);  // tc-- O(n) and sc -- O(n)
		
//		creating fmap of the given string or chArr
		int [] fmap = createFrequencyMap(str); // tc -- O(n) and sc -- O(1)
		
//		sorting using Frequency Mapping
		sortStringUsingFmap( fmap, chArr); // tc -- O(n) and sc -- O(1)
		
//		after soring we will convert character array to string
		String ans = convertChArrayToString(chArr); // tc -- O(n) and sc -- O(1)
		System.out.println("After Sorting String is : " + ans);
	}
//	method for convert string into character Array
	public static char[]  covertStringToCharArr(String s) {
		int len = s.length();
		char [] chArr = new char[len];
		for(int i = 0; i < len; i ++) {
			chArr[i] = s.charAt(i);
		}
		return chArr ;
	}
	
//	Method for convert character array to String 
	public static String convertChArrayToString(char [] chArr) {
		int size = chArr.length;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i ++) {
			sb.append(chArr[i]);
		}
//		convert StringBuilder to string
		String res = String.valueOf(sb);
		return res;
	}
//	Method for create Frequncy Map Array by shifing mapping
	public static int [] createFrequencyMap(String s) {
//		size = start - end + 1
		int size = 'z' - 'a' + 1;
//		System.out.println(size); // 26
		int [] fmap = new int[size]; // here only 26 size array create now who start 0 index or actual value 97 
		for(int i = 0; i < s.length(); i ++) {
			char ascii = s.charAt(i);
			int sv = ascii - 'a'; // ascii - 97; // for  sv is shifted value -- sv = actual value - start -->= 98 - 92 = 1 --> b will be on 1 index
			fmap[sv] ++;
		}
		return fmap;
	}
//	Method for sort character array using f map
	public static void sortStringUsingFmap(int [] fmap, char [] chArr) {
		int k = 0;
		for(int i = 0; i < fmap.length; i ++) {
			int sv  = i;
			int freq = fmap[sv];
			char av =(char)( sv + 'a');
			for(int j = 0; j < freq; j ++) {
				chArr[k] = av;
				k ++;
			}
		}
	}
}
