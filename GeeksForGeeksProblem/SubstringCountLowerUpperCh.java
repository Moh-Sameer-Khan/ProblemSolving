package com.GeeksForGeeksProblem;

import java.util.Scanner;

public class SubstringCountLowerUpperCh {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scn.next();
		int ans = countSubstring(s);
		System.out.println("Total substring is : " + ans);;
	}
	public static int countSubstring(String s) {
		int count = 0;
//		traversaal for substirng
		for(int i = 0; i < s.length(); i ++) {
			int lowerCount = 0;
			int upperCount = 0;
			for(int j = i; j < s.length(); j ++) {
				char ch = s.charAt(j);
				boolean c = checkLowerUpper(ch);
//				checking character is upper or lower up and increase down 
				if(c) {// if true -- means lower character
					lowerCount ++;
				}else {
					upperCount ++;
				}
//				now check in substring lower and upper are equal or not 
				if(lowerCount == upperCount) {
					count ++;
				}
			}
		}
		return count;
	}
	public static boolean checkLowerUpper(char ch) {
		if(ch >= 'a' && ch <= 'z') {
			return true;
		}else {
			return false;
		}
		
	}
	
//	orr we can by inbuilt method ***************
	
//	public static int countSubstring(String S) 
//    { 
//        int count = 0;
//        for (int i = 0; i < S.length(); i++) {
//            int upperCount = 0;
//            int lowerCount = 0;
//            for (int j = i; j < S.length(); j++) {
//                char c = S.charAt(j);
//                if (Character.isUpperCase(c)) {
//                    upperCount++;
//                } 
//                else {
//                    lowerCount++;
//                }
//                if (upperCount == lowerCount) {
//                    count++;
//                }
//            }
//        }
//        return count;
//            
//    }
 	
	
}
