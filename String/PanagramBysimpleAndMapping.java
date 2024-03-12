package com.String;

public class PanagramBysimpleAndMapping {
	public static void main(String[] args) {
//		O(n * 26) and O(1) -- Method 1
//	O(n + 26) and O(1) -- Method 2 // better
		
//		String str = "abcdefghijklmnopqrstuvwxyz";// Panagram 
		String str = "bcdefghijklmnopqrstuvwxyz"; // Not a pa nagram
//		String str = "abcdefghijklmnopqrstuvwxyzssszzzzzzzkjfkjjfjfkjfkj"; // Panagram
		isPanigram(str);
	}
	
	//// Method 1 -- Simple
	
//	public static void isPanigram(String str) {
//		for(int i = 'a'; i <= 'z';  i ++) { // a - z comparison /// O(26)
//			char ch = (char) i;
//			boolean isPresent = false;
//			for(int j = 0; j < str.length(); j ++) { // traversal on string  // O(n)
//				if(str.charAt(j) == ch) {
//					isPresent = true;
//					break; // bcz we are finding atleast one time 
//				}
//			}
//			if(isPresent == false) {
//				System.out.println("Not A PANAGRAM.");
//				return;
//			}
//		}
//		System.out.println("Panagram.");
//	}
	
	
		public static void isPanigram(String str) {
			int [] fmap = crateFrequencyMap(str);  //tc -- O(n)
			for(int i = 'a'; i <= 'z'; i ++) { /// O(26) -- tc
				if(fmap[i] == 0) { // we are getting 97, 98, ... and if any will be 0 then NOt Pan. atleast one time a - z
					System.out.println("Not a panagram");
					return;
				}
			}
			System.out.println("Panagram");
		}
		public static int [] crateFrequencyMap(String str) {
			int len = str.length();
			int [] fmap = new int[256]; // sc -- O(256)  == O(1)  // bcz total 0 - 255 and can take 26 but there will condition add
			for(int i = 0; i < len; i ++) {
				char ch = str.charAt(i);
				fmap[ch] ++;
			}
			return fmap; 
		}
}
