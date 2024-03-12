package com.String;

import java.util.Scanner;

public class CountUppLowVowDigitInString {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Mix String number alphabet upper and lower");
		String str = scn.next();
//		count(str); // method 1
		countOwn(str);
	}
	
	//// Method 1 by inbuilt function using but we use our for interview
	
//	public static void count(String str) {
//		int lCount = 0;
//		int uCount = 0;
//		int dCount = 0;
//		int vCount = 0;
//		for(int i = 0; i < str.length(); i ++) {
//			char ch = str.charAt(i);
//			if(Character.isLowerCase(ch)) {
//				lCount ++;
//			} else if(Character.isUpperCase(ch)) {
//				uCount ++;
//			} else if(Character.isDigit(ch)) {
//				dCount ++;
//			} // we can't use this bcz any character will not come here so make other if// else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U')
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U') {
//				vCount ++;
//			}
//		}
//		System.out.println("Lower is : " + lCount);
//		System.out.println("Upper is : " + uCount);
//		System.out.println("Digit is : " + dCount);
//		System.out.println("Vowel is : " + vCount);
//	}
	
	public static void countOwn(String str) {
		int lCount = 0;
		int uCount = 0;
		int dCount = 0;
		int vCount = 0;
		for(int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			if(isLower(ch)) {
				lCount ++;
			}else if(isUpper(ch)) {
				uCount ++;
			}else if (isDigit(ch)) {
				dCount ++;
			}
			if(isVowel(ch)) {
				vCount ++;
			}
		}
		System.out.println("Lower is : " + lCount);
		System.out.println("Upper is : " + uCount);
		System.out.println("Digit is : " + dCount);
		System.out.println("Vowel is : " + vCount);
	}
	public static boolean isLower(char ch) {
//		if(ch - 'a' >= 0 && ch - 'z' <= 0 ) { // or
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
	public static boolean isDigit(char ch) {
		if(ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}
	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U') {
			return true;
		}
		return false;
	}

}
