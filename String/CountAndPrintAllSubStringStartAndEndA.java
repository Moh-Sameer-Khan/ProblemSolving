package com.String;

public class CountAndPrintAllSubStringStartAndEndA {

	public static void main(String[] args) {
		String str = "ababa"; // 18
		int ans = countNonVowel(str);
		System.out.println("Total Count Substring without Vowel is : " + ans);
	}
	public static int countNonVowel(String s) {
		int count = 0;
		int len = s.length();
		for(int st = 0; st < len; st ++) {
			for(int end = st + 1; end <= len; end ++) {
				String ans = s.substring(st, end);
				boolean b = check(ans);
				if(b == true) {
					count ++;
				}
			}
		}
		return count;
	}
	public static boolean check(String s) {
		int len = s.length();
		for(int i = 0; i < len ; i ++) {
			char ch = s.charAt(i);
			char ch1 = s.charAt(len - 1) ;
			if((ch == 'a') && (ch1 == 'a')) {
				System.out.println("ch is ->" + ch + " & ch1 is -> " + ch1 + " -- "+ s);
				return true;
			}
		}
		return false;
	}
}
