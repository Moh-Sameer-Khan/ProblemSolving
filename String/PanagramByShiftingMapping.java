package com.String;

public class PanagramByShiftingMapping {
	public static void main(String[] args) {

//	O(n + 26) and O(1) 
		
		String str = "abcdefghijklmnopqrstuvwxyz";// Panagram 
//		String str = "bcdefghijklmnopqrstuvwxyz"; // Not a pa nagram
//		String str = "abcdefghijklmnopqrstuvwxyzssszzzzzzzkjfkjjfjfkjfkj"; // Panagram
		isPanigram(str);
	}
	
		public static void isPanigram(String str) {
			int [] fmap = crateFrequencyMap(str); // O(n)
			for(int i = 0; i < fmap.length; i ++) { // O(26) // start 0 bcz fmap starint from 0 to 25 shifted value
				if(fmap[i] == 0) {
					System.out.println("Not A Panagram.");
					return;
				}
			}
			System.out.println("Panagram");
		}
		public static int [] crateFrequencyMap(String str) {
			int size = 'z' - 'a' + 1; // 122 - 97 + 1 // by ascii value
//			System.out.println(size);
			int [] fmap = new  int [size]; // size will be now 26
			for(int i = 0; i < str.length(); i ++) {
				char ch = str.charAt(i);
				int sv = ch - 'a'; //  or 97 --> 'a'  and bcz ShiftedValue = actual value - start
				fmap[sv] ++;
			}
			return fmap;
		}
}
