package com.String;

public class FirstNonRepeatingCharacterMappingAndForLoop {

	public static void main(String[] args) {
		String str = "abcdbcccaapqs";// d
//		String str = "aabbcc"; // 0 not found
		char ans = findFirstNonRepeating(str);
		System.out.println(ans);
	}
	
// Method 2 by mapping optimize
	public static char findFirstNonRepeating(String s) {
		int [] fmap = createFreqMap(s); /// O(10lacs)
//		traversal on string if find 1 than print that character or return
		for(int i = 0; i < s.length(); i ++) { //  O(10lacs) // total 20 lacs we can optimize another method only one traversal
			char ch = s.charAt(i);
			if(fmap[ch - 'a'] == 1) {
				return ch;
			}
		}
//		if not found
		return '0';
	}
	public static int [] createFreqMap(String s) {
		int size = 'z' - 'a' + 1;
		int [] fmap = new int[size];
		for(int i = 0; i < s.length(); i ++) {
			char ch  = s.charAt(i);
			int sv = ch - 'a';
			fmap[sv] ++;
		}
		return fmap;
	}
	
	
	
	/// By for loop Method 1
//	public static void findFirstNonRepeating(String s) {
//		int len = s.length();
//		for(int i = 0; i < len; i ++) {
//			boolean b = true;
//			for(int j = i + 1; j < len; j ++) {
//				if(s.charAt(i) == s.charAt(j)) {
//						b = false;
////					return;
//						break;
//				}
//			}
//			if(b == true  ) {
//				System.out.print(s.charAt(i));
//			}
//		}
//	}
}
