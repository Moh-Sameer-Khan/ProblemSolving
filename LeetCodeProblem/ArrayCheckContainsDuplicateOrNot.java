package com.LeetCodeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCheckContainsDuplicateOrNot {
	public static Scanner  scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size, and values : ");
		int n = scn.nextInt();
		int [] arr = new int [n];
		inputArray(arr);
		boolean b = checkDuplicate(arr);
		System.out.println(b);
	}
	public static boolean checkDuplicate(int [] arr) {
		 // Sort Array easy to solve
        Arrays.sort(arr);
        // traversal on array
		for(int i = 0; i < arr.length - 1; i ++) {
			 // we are checking next element is equal to previous element
			if(arr[i] == arr[i + 1]) {
				return true;
			}
		}
	//  if any element in array not equal then return false
		return false;
	}
	public static void inputArray(int [] arr) {
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = scn.nextInt();
		}
	}
}

//Question -->
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
