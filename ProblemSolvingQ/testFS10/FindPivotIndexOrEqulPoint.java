package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class FindPivotIndexOrEqulPoint {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter array size, input values : ");
        int size = Integer.parseInt(scn.next());
        int[] arr = new int[size];
        inputArray(arr);
        int ans = findPivotIndex(arr);
        System.out.println(ans);
    }
    public static int findPivotIndex(int[] arr) {
       if(arr.length == 1) {
            return 1;
        }
        int len = arr.length;
        int leftSum = 0;
        int rightSum = sum(arr, 1, len - 1);
        for(int i = 0; i < len - 1; i ++) {
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
            rightSum -= arr[i + 1];
        }
        return -1;
    }
    public static int sum(int[] arr, int start, int end) {
        int ans = 0;
        for(int i = start; i <= end; i ++) {
            ans += arr[i];
        }
        return ans;
    }
    public static void inputArray(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }

}

//
//Question
//
//Sample Input 0
//
//6
//1 7 3 6 5 6
//Sample Output 0
//
//3
//Explanation 0
//
//The pivot index is 3.
