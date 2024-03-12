package com.String;

import java.util.Scanner;

public class MostFrequencyPirntStringIndex {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String str = scn.next();
		int [] ans = printMostFreqIndex(str);
		System.out.println("Most Frequency character index is : ");
		printArray(ans);
	}
//	find out which character is most frequent and print all index
	public static int [] printMostFreqIndex(String s) {
		int len = s.length();
//		create frequency map for find largest frequency in the string using this map
		int [] fmap = createFreqmap(s);
//		find largest frequency in fmap and get that character
		char ch = ' ';
		int maxFreq = 0;
		for(int i =0; i < fmap.length; i ++) {
			int currFreq = fmap[i];
			if(currFreq > maxFreq) {
				maxFreq = currFreq;
				ch = (char)('a' + i); // 97 + i --> after covert to char we will get any character who have max freq
			}
		}
//		here till now we findout maximum freq and character Ex aaabcd --> maxF - 3 & char --> a
//		print all indexes traversal on string
		int [] ans = new int[maxFreq];
		int k = 0;
		for(int i = 0; i < len; i ++) {
			if(s.charAt(i) == ch) {
//				ans[k] = i;
//				k ++;
				// or
				ans[k++] = i; // first k count after that k ++ 
			}
		}
		return ans;
	}
//	method for create frequency Map
	public static int [] createFreqmap(String s) {
		int [] fmap = new int [26];
		for(int i = 0; i < s.length(); i ++) {
			char ch = s.charAt(i);
			int sv = ch - 'a';
			fmap[sv] ++;
		}
		return fmap;
	}
//	for printing array
	public static void printArray(int [] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
