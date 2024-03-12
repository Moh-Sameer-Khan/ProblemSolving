package com.String;

public class CountNonVowelSubString {

	public static void main(String[] args) {
//		String str = "abc"; // 3
		String str = "sameer"; // 18
		int ans = countNonVowel(str);
		System.out.println("Total Count Substring without Vowel is : " + ans);
	}
	public static int countNonVowel(String s) {
		int len = s.length();
		int count = 0;
		for(int st = 0; st < len; st ++) {
			for(int end = st + 1; end <= len; end ++) {
				String ans = s.substring(st, end);
				boolean b = isVowel(ans);
//				System.out.println(b);// here will cme all substring
				if(b == false) {
					count ++;
				}else {
					break;
				}
//				System.out.println(b); // here will come only without vowel string bcz break if find any vowel
			}
		}
		return count;
	}
//	Method for check vowel 
	public static boolean isVowel(String s) {
		for(int i = 0; i < s.length(); i ++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
				return true;
			}
		}
//		System.out.println(b);
		return false;
	}
}
