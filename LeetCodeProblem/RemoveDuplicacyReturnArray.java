package com.LeetCodeProblem;

import java.util.Scanner;

//0 0 1 1 1 2 2  3 3 4 
//After Remving Element Array is : 
//0 1 2 3 4 2 2 3 3 4 

public class RemoveDuplicacyReturnArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size , input, Input divisible value");
		int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        inputArray(arr);
        int [] ans = removeDuplicacy(arr);
        System.out.println("After Remving Element Array is : " );
        printArray(ans);
	}
	public static int [] removeDuplicacy(int[] arr) {
		// for if length of array will be 0 then return 0
		if(arr.length == 0) {
			return new int [] {-1};
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
		return arr ;
	  }
	  public static void inputArray(int [] arr) {
	        for (int i = 0; i < arr.length; i ++) {
	            arr[i] = scn.nextInt();
	        }
	    }
	  public static void printArray(int [] arr) {
		  for(int ele : arr) {
			  System.out.print(ele + " ");
		  }
	  }
}
