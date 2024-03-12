package com.String;

public class AnagramByMappingAndSorting {
	public static void main(String[] args) {
//		O(n) and O(n) -- Method 1
//	O(n) and O(1) -- Method 2 // better
		
		String str2 = "earth"; // eath
		String str1 = "heart"; 

		isAnagram(str1, str2);
	}
	
	//// Method 1 -- By sorting string
//	do own self using sorting after sorting both string will be same 

	
	/// method by Mapping ---  and check frequency if equal then anagram otherwise not anagram
	
		public static void isAnagram(String str1, String str2) {
			int [] fmap1 = crateFrequencyMap(str1);  //tc -- O(n) and O(1)
			int [] fmap2 = crateFrequencyMap(str2); // tc -- O(n) and O(1)
			
//			for(int i = 'a'; i <= 'z'; i ++) { /// O(26) -- tc
//				if(fmap1[i] != fmap2[i]) { 
//					System.out.println("Not a Anagram");
//					return;
//				}
//			System.out.println("Anagram");
//		}
			/// or
			boolean isAnagram = true;
			for(int i = 0; i < 256; i ++) { // tc- O(1) == O(256)
				if(fmap1[i] != fmap2[i]) { // 
					isAnagram = false;
					break;
				}
			}
			if(isAnagram) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not a Anagram");
			}
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
