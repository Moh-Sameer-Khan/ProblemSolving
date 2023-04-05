package com.LeetCodeProblem;

import java.util.Scanner;

public class PalindromeOrNot {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int x = scn.nextInt();
		  boolean b = isPalindrome(x);
		  if(b) {
			  System.out.println("Palindrome");
		  }else {
			  System.out.println("Not a Palindrome");
		  }
	}
// Method for checking true or not palindrome
	 public static boolean isPalindrome(int x) {
	        boolean isPalin = checkPalindrome(x);
	        if(x < 0) {
	            return false;
	        }
	        if(x >= 0 && isPalin == true) { 
	            return true;
	        }else {
	            return false;
	        }
	    }
//	 find from number palindrome or not
	public static boolean checkPalindrome(int x) {
        int k = x;
        int ans = 0;
        while(k > 0) {
            int rem = k % 10;
            k = k / 10;
            ans = ans * 10 + rem;
        }
        if(ans == x) {
            return true;
        }else {
            return false;
        }
    }
}
