package com.String;

public class MergeString {
	public static void main(String[] args) {
		String s1 = "GEEK";
		String s2 = "STER";
		
//		1. Method
//		for(int i = 0; i < s1.length(); i ++) {
//			System.out.print(s1.charAt(i));
//			System.out.print(s2.charAt(i) + " ");
//		}
		
//		2. Method
		String ans = "";
		for(int i = 0; i < s1.length(); i ++) {
			ans = ans + s1.charAt(i) + s2.charAt(i);
		}
		System.out.println(ans); 
	}
}
