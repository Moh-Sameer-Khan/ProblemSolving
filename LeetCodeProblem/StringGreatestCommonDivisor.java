package com.LeetCodeProblem;

import java.util.Scanner;

public class StringGreatestCommonDivisor {
	public static Scanner  scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two strings : ");
		String str1 = scn.nextLine(); 
		String str2 = scn.nextLine();
		String ans = gcdOfStrings(str1, str2);
		System.out.println("Greatest Common Divisor String is : " + ans);
	}
	public static String gcdOfStrings(String str1, String str2) {
//		if both string are not equal after concatenate  reverse too check
        if  (!(str1 + str2).equals(str2 + str1))  return "";
        int len1 = str1.length();
        int len2 = str2.length();
        int gcd = 1;
//        finding min length of both strings
        int min = Math.min(len1,len2);
//        for (int i = 1; i <= min; i ++){ // or
        for (int i = 2; i <= min; i ++){ 
            if (len1 % i == 0 && len2 % i == 0) {
                gcd = i;
            }
        }
        return str2.substring(0, gcd);
    }
}

//
//Question -->
//
//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""