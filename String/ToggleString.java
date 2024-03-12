package com.String;

import java.util.Scanner;

public class ToggleString {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scn.next();
		String ans = toggleString(str);
		System.out.println(ans);
	}
	public static String toggleString(String str) {
		 String ans = "";
		 for(int i = 0; i < str.length(); i ++) {
			 char ch = str.charAt(i);
			 if(isLower(ch)) {
				 ch -= 32;
			 } else {
				ch += 32; 
			 }
			 ans = ans + ch;
		 }
		 return ans;
	}
	public static boolean isLower(char ch) {
		if(ch >= 'a' && ch <= 'z') {
			return true;
		}
		return false;
	}
	public static boolean isUpper(char ch) {
		if(ch >= 'A' && ch <= 'Z') {
			return true;
		}
		return false;
	}
}
