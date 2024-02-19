package com.FS10_HackerRank.ProblemSovingQ;
import java.util.Arrays;
import java.util.Scanner;
public class SubArraySum0 {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        inputArray(arr);
        boolean b = checkSumZeroOfSubArray(arr);
        if(b) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public static boolean checkSumZeroOfSubArray(int [] arr) {
//        int len = arr.length;
//        for(int st = 0; st < len; st ++) {
//            for(int end = st; end < len; end ++) {
////               printSubArray(arr, st, end);
//                int sum = 0;
//                for(int i = st; i <= end ; i ++) {
//                    sum += arr[i];
//                    if(sum == 0 || arr[i] == 0) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
    	
    	/// Method 2 -- Not working now few mistakes
    	for(int i = 1; i < arr.length; i ++) {
    		arr[i] += arr[i - 1];
    	}
    	Arrays.sort(arr);
    	for(int i = 0; i < arr.length - 1; i ++) {
    		if(arr[i] == arr[i + 1] || arr[i] == 0) {
    			return true; 
    		}
    	}
    	return false;
    }
    public static void inputArray(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
//    for print subarray
//    public static void printSubArray(int [] arr, int st, int end) {
//        for(int i = st; i <= end; i ++) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//    }
}
