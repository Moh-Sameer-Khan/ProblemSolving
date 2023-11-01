package com.GeeksForGeeksProblem;

import java.util.Scanner;

public class MaxSumWithAdjacentArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size and values of array : ");
		int n = scn.nextInt();
		int [] arr = new int [n];
		inputArr(arr);
		int ans = findMaxSumAdjacent(arr);
		System.out.println(ans);
	}
	public static int findMaxSumAdjacent(int [] arr) {
		int n = arr.length;
//		if array have not value
		if (n == 0) {
			return 0;
		}
//		if array have one value then that value will be max
		int val1 = arr[0];
		if(n == 1) {
			return val1;
		}
//		if array have two value then that who is max in both that will be max
		int val2 = Math.max(val1, arr[1]) ;
		if(n == 2) {
				return val2;
		}
		// contains maximum sum at the end
		int maxSum = 0;
//		fill remaining positions 
//		traversal on array from 2
		for (int i = 2; i < n; i ++) {
//			find max and change the next value like fibonacci series
			maxSum = Math.max(arr[i] + val1,  val2);
			val1 = val2;
			val2 = maxSum;
		}
		return maxSum;
	}
	public static void inputArr(int [] arr) {
		for(int i = 0; i  < arr.length; i ++) {
			arr[i] = scn.nextInt();
		}
	}
}
