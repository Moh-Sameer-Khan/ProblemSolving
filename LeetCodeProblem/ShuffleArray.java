package com.LeetCodeProblem;

import java.util.Scanner;

public class ShuffleArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array and shuffle  array no. ");
        int n = scn.nextInt();
        int [] arr = new int [n];
        inputArr(arr);
        int s = scn.nextInt();
        int [] ans = createShuffleArray(arr, s);
        System.out.println();
        System.out.println("After shuffle array is : ");
        printArr(ans);
	}
	public static int [] createShuffleArray(int [] arr, int s) {
//		//// Method -- 1
//		int [] ans = new int [2 * s];
//		for(int i = 0; i < s; i ++) {
//			ans[i * 2] = arr[i];
//			ans[i * 2 + 1] = arr[s + i];
//		}
//		return ans;
		
		
//		Method -- 2
		 int [] ans = new int[arr.length];
         int k = 0;
         for(int i = 0, j = s; i < s; i ++,  j ++) {
             ans[k] = arr[i];
             k ++;
             ans[k] = arr[j];
             k ++;
         }
         return ans;		
	}
	public static void inputArr(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
   }
	public static void printArr(int [] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}




//Question -->
//
//Example 1:
//
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7] 
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//Example 2:
//
//Input: nums = [1,2,3,4,4,3,2,1], n = 4
//Output: [1,4,2,3,3,2,4,1]