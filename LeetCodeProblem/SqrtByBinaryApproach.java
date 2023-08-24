package com.LeetCodeProblem;

import java.util.Scanner;

public class SqrtByBinaryApproach {
	public static Scanner  scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int n = scn.nextInt();
		int ans = findSqrt(n);
		System.out.println("Given number Square root exact or less than  is : " + ans);
	}
	public static int findSqrt(int n) {
		 // By Binary Approach
        long st = 1 , end = n ,  mid = (st + end) / 2;
        while(st <= end) {
            if(mid * mid == n) {
                break; // here retrun mid indirectly
            }else if (mid * mid > n) {
                end = mid - 1;
            }else {
                st = mid + 1;
            }
            mid = (st + end) / 2;
        }
        return (int)mid;
        
        
        
//        another  method
//        int l = 1;
//        int r = num;
//        int mid = (l + r) / 2;
//        while (l <= r) {
//            if(mid * mid == num) {
//                return mid;
//            }else if(mid * mid > num) {
//                r = mid - 1;
//            }else {
//                l = mid + 1;
//            }
//            mid = (l + r) / 2;
//
//        }
//        return (int)mid;
	}
}
