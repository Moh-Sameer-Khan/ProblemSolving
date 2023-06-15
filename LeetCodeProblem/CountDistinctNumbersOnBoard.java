package com.LeetCodeProblem.POTD;

import java.util.Scanner;

public class CountDistinctNumbersOnBoard {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number  : ");
		int n = scn.nextInt();
		int ans = countDistinctIntegers(n);
		System.out.println("Total count distinct integer is : " + ans);
	}
	public static int countDistinctIntegers(int n) {
		 if(n <= 2) {
	            return 1;
	        }else {
	            return n - 1;
	        }
	}
}
