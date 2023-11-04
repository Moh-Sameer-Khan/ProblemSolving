package com.GeeksForGeeksProblem;

import java.util.Scanner;

public class FibonacciSeriesPrint {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number to find Fibbonacciseries");
		int n = scn.nextInt();
		long[] ans = fibonacciSeries(n);
		printArray(ans);
	}
	public static long [] fibonacciSeries(int n) {
		//// Method for -- 0,1,1,2,3,5,8,13--
//			long a = 0; 
//			long b = 1;
//			long [] ans = new long[n];
//			if(n == 1) { // for 1= n edge case
//				ans[0] = a;
//				return ans;
//			}
//			if(n == 0) { // for 0 = n edge case
//				return new long [] {-1};
//			}
//			ans[1] = b;
//			for(int i = 2; i <= n - 1; i ++) {
//				long c = a + b;
//	           a = b;
//	           b = c;
//	           ans[i] = c;
//	       }
//	       return ans;
//		
		
		///// But in GFG only output --> 1 1 2 3 5 8 13......so
		long a = 0; 
		long b = 1;
		long [] ans = new long[n];
		if(n == 0) { // for 0 = n edge case
			return new long [] {-1};
		}
		ans[0] = b;
		for(int i = 1; i <= n - 1; i ++) {
			long c = a + b;
           a = b;
           b = c;
           ans[i] = c;
       }
       return ans;
		
	}
	public static void printArray(long [] arr) {
		for(long ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
