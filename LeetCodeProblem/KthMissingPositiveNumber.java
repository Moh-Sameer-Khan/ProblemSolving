package com.LeetCodeProblem;

import java.util.Scanner;

public class KthMissingPositiveNumber {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(scn.next());
		int [] arr = new int[size];
		System.out.println("Enter array values : ");
		inputArray(arr);
		System.out.println("Enter Missing Position : ");
		int k = scn.nextInt();
		int ans = findKthMissing(arr, k);
		System.out.println("Missing number is : " + ans);
	}
	public static int findKthMissing(int [] arr, int k) {
 //         Method --- 1    ###############   O(n)
        
		// for(int i : arr){
		// 	if(i <= k) k++; else break;
		// }
		// return k;
        
        
        
//         Method --- 2    ############### O(log(n))
        
         int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + k;
	}
	public static void inputArray(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
  }
}

//
//Question -- >
//
//Example 1:
//
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
//Example 2:
//
//Input: arr = [1,2,3,4], k = 2
//Output: 6
//Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
