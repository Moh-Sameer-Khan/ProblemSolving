package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class GCDFindArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size : ");
		int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        System.out.println("Enter Values array is  : ");
        inputArray(arr);
        int ans = findGCD(arr);
        System.out.println("GREATEST Common Divisor " + ans);
        findLCM(arr);
	}
	public static void findLCM(int [] arr) {
		 int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < arr.length; i ++) {
	            if(arr[i] < min) {
	                min = arr[i];
	            }
	            if(arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        int lcm = (min * max) / findGCD(arr);
	        System.out.print("LCM is " + lcm);
	}
	public static int findGCD(int [] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i ++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
//        min --> a, max --> b
        while(min != max) {
            if(min > max) {
                min = min - max;
            }else {
                max = max - min;
            }
        }
//        int lcm = min * max / min;
//        System.out.println("LCM "  + lcm);
        return min;
    }
    public static void inputArray(int [] arr) {
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}
