package com.String;

import java.util.Scanner;

public class GoodStringByShifingMapping {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scn.next();
		boolean ans = checkGoodString(str); // good means Ex - aabbcc same all characters
		if(ans) {
			System.out.println("String is good");
		}else {
			System.out.println("String is not good");
		}
	}
	public static boolean checkGoodString(String s) {
		int len = s.length();
//		create Frequency Map
//		boolean b = true;
		int [] fmap = createFreqMap(s);
		for(int i = 0; i < fmap.length; i ++) {
			if(fmap[i] == 2 ) {
				return true;
			}
		}
		return false;
	}
//	method for creating frequency map
	public static int [] createFreqMap(String s) {
		int len = s.length();
		int [] fmap = new int [26];
		for(int i = 0; i < len; i ++) {
			char ch = s.charAt(i);
			int sv = ch - 'a';
			fmap[sv] ++;
		}
		return fmap;
	}
}
