package com.LeetCodeProblem;

import java.util.Scanner;

public class PeakElementArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(scn.next());
		int [] arr = new int[size];
		System.out.println("Enter array values : ");
		inputArray(arr);
		int ans = findPeakElement(arr);
		System.out.print("Peak Element is : " + ans);
	}
	public static int findPeakElement(int [] arr) {
        
//      Method -- 1 Bruteforce solution   ----*********************  -- O(n)
     // for(int i = 1; i < arr.length - 1; i ++) {
     //     if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
     //         return i;
     //     }
     // }
     // return -1;
     
     
//      Method --- 2  &&&&&&&&&&&&&&&&&&&&  O(log(n)) by Binary search
     
     int st = 0, end = arr.length - 1;
     
//      traversal on array and find peak
     
     while(st <= end) {
         int mid = st + (end - st) / 2;
         if(arr[mid] < arr[mid + 1]) {
             st = mid + 1;
         }else {
             end = mid - 1;
         }
     }  
     return st;
  }
	public static void inputArray(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
  }
}


//
//question is --- https://leetcode.com/problems/peak-index-in-a-mountain-array/
//	
//	
//	Example 1:
//
//		Input: arr = [0,1,0]
//		Output: 1
//		Example 2:
//
//		Input: arr = [0,2,1,0]
//		Output: 1
//		Example 3:
//
//		Input: arr = [0,10,5,2]
//		Output: 1
