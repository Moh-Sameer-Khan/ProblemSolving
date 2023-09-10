package com.LeetCodeProblem;

import java.util.Scanner;

public class SearchInsertPositionInArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size and inputs array : ");
		int n = scn.nextInt();
		int [] arr = new int [n];
		inputArray(arr);
		System.out.println("Enter target");
		int target = scn.nextInt();
		int ans = searchInsertPosition(arr, target);
		System.out.println(ans);
	}
	public static int searchInsertPosition(int [] nums, int target) {
		
        int st = 0;
        int end = nums.length - 1;
        int mid = (st + end) / 2;
        while(st <= end) {
            if(nums[mid] < target) {
                st = mid + 1;
            }else if(nums[mid] > target) {
                end = mid - 1;
            }else {
            	return mid;
            }
            
            mid = (st + end) / 2;
        }
        return st;
	}
	public static void inputArray(int [] arr) {
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = scn.nextInt();
		}
	}
}
