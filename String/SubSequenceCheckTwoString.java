package com.String;

public class SubSequenceCheckTwoString {

	public static void main(String[] args) {
//		String subStr = "abc"; // Substring
//		String str = "afghbhjc"; 
		
//		String subStr = "abc"; // Substring
//		String str = "afghbhjcjjhhjhhj"; 
		
		String subStr = "axc"; //Not  Substring bcz x is after c so see 2nd string
		String str = "afghbhjchhx"; 
		boolean ans = checkSubsequnce(subStr, str);
		if(ans == true) {
			System.out.println("Given substring is a Substring");
		}else {
			System.out.println("Given substring is not a Substring");
		}
	}
	public static boolean checkSubsequnce(String s1, String s2) {
		int p1 = 0; 
		int p2 = 0;
		while(p1 < s1.length() && p2 < s2.length()) {
			char ch1 = s1.charAt(p1);
			char ch2 = s2.charAt(p2);
			if(ch1 ==  ch2) {
				p1 ++;
				p2 ++;
			}else {
				p2 ++;
			}
		}
		if(p1 == s1.length()) {
			return true;
		}else {
			return false;
		}
	}
}
