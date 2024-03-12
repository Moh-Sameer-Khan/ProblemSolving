package com.String;

public class AnagramByShiftingMapping {
	public static void main(String[] args) {
//	O(n + 26) and O(1)
		
		String str1 = "good";
		String str2 = "doog";
		boolean b = isAnagram(str1, str2);
		if(b) {
			System.out.println("Anagram.");
		}else {
			System.out.println("Not Anagram.");
		}
	}
	
		public static boolean isAnagram(String str1, String str2) {
			int [] fmap1 = crateFrequencyMap(str1); // O(n)
			int [] fmap2 = crateFrequencyMap(str2);// O(n)
			boolean b = true;
			for(int i = 0; i < fmap1.length; i ++) { // O(26) 
				if(fmap1[i] != fmap2[i]) {
					b = false;
				}
			}
			return b;
		}
		public static int [] crateFrequencyMap(String s) {
			int size = 'z' - 'a' + 1; // 122 - 97 + 1 // by ascii value
//			System.out.println(size);
			int [] fmap = new  int [size]; // size will be now 26
			for(int i = 0; i < s.length(); i ++) {
				char ch = s.charAt(i);
				int sv = ch - 'a'; //  or 97 --> 'a'  and bcz ShiftedValue = actual value - start
				fmap[sv] ++;
			}
			return fmap;
		}
}
