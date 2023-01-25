package com.LeetCodeProblem;

import java.util.Scanner;

public class RemoveDuplicacyArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size , input, Input divisible value");
		int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        inputArray(arr);
//        int k = scn.nextInt();
        int ans = removeDuplicacy(arr);
        System.out.println("After Remving Element is : " + ans);
	}
	public static int removeDuplicacy(int[] arr) {
		// for if length of array will be 0 then return 0
		if(arr.length == 0) {
			return 0;
		}
		// initial start from 1  and 0 index always a unique so start 1
		int k = 1;
//	 traverse on array 
		for(int i = 0; i < arr.length - 1; i ++) {
			if(arr[i] != arr[i + 1]) {
				// checking  for duplicacy 
				arr[k] = arr[i  + 1];
				k ++;
			}
		}
		// final return array coount how many elements are duplicates
		return k ;
	  }
	  public static void inputArray(int [] arr) {
	        for (int i = 0; i < arr.length; i ++) {
	            arr[i] = scn.nextInt();
	        }
	    }
}
