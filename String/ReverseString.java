package com.String;

import java.util.Scanner;

public class ReverseString {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scn.next();
		scn.close();
		String ansStr = reverseString(str);
		System.out.println("Reverse String is : " + ansStr);
	}
	
//	// Method 1 -- tc and sc -- O(n^2)  & O(1)
//	public static String reverseString(String str) {
//		String ans = "";
////		for(int i = str.length() - 1; i >= 0; i --) {
////			ans = ans + str.charAt(i);
////		}
//		/// or 
//		for(int i = 0; i < str.length(); i ++) { //o(n) //Total is -- O(n^2)  & O(1)
//			ans = str.charAt(i) + ans; // O(n) // bcz one by one string append
//		}
//		return ans;
//	}
	
//	Method - 2 -- Tc and Sc -- O(n) & O(n) 
	//// Using String Builder -- append only in last -- o (1)
	
//	public static String reverseString(String str) {
//		String ans = "";
//		StringBuilder sb = new StringBuilder(); //O(n) -- for space
//		for(int i = str.length() - 1; i >= 0; i --) {
////			ans = str.charAt(i) + ans; //O(n) not use but use below for O(1)
//			char ch = str.charAt(i);
//			sb.append(ch); // here string is in stringBuilder convert this into string
//		}
////		for(int i = 0; i < sb.length(); i ++) {
////			ans += sb.charAt(i);
////		} // or use inbuilt function
//		ans = sb.toString(); // O(n)
//		return ans;
//	}
	
	
//	/// Method 3 -- using Inbuilt Function
	
	public static String reverseString(String str) {
		String ans = "";
		StringBuilder sb = new StringBuilder(str); // O(n)
//		System.out.println(sb); // op -- what will be str but in SB form not string
		sb.reverse();  //O(n)
//		System.out.println(sb); // reverse but in SB form so convert String
		ans = sb.toString(); // O(n)
		return ans;
	}
}
