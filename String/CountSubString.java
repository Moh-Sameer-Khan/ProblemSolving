package com.String;

public class CountSubString {
	public static void main(String[] args) {
		String str = "same"; // 10
//		String str = "sam e"; // 15 space also count 
		int ans = countSubString(str);
		System.out.println("Total Substring is : " + ans);
	}
	public static int countSubString(String s) {
		int len = s.length();
		int ans =( len * (len + 1)) / 2;
		return ans;
	}
}
