package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class ConsecutiveExactGivenTimesInArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size, values");
		 int n = scn.nextInt();
	        int [] arr = new int [n];
	        inputArr(arr);
	        boolean b = consecutiveOneExact(arr);
	        if(b) {
	            System.out.print("YES");
	        }else {
	            System.out.print("NO");
	        }
	}
	public static boolean consecutiveOneExact(int [] arr) {
        int maxCount = 0;
        int count = 0;
        if(arr.length < 3) {
            return false;
        }
//         assume previous element is zero
        int prevEl = 0;
        for(int i = 0; i < arr.length; i ++) {
            int currEl = arr[i];
            if(currEl == prevEl) {
//              if same as previous one element then increase the count
                count ++;
            }else {
//              else restart the count
                count = 1;
                prevEl = currEl;
//                 if maxcount is equal to given condition then return 
                if(maxCount == 3) {
                    return true;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return false;
    }
    public static void inputArr(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}
