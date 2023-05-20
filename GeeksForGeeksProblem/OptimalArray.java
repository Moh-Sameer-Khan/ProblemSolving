package com.GeeksForGeeksProblem;

import java.util.Scanner;

public class OptimalArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array ans values : ");
		int n = scn.nextInt();
		int [] arr = new int [n];
		inputValues(arr, n);
		long [] ans = optimalArray(n, arr);
		printArray(ans, n);
	}
	public  static long [] optimalArray (int n, int a []) {
		long [] res = new long [n];
		res [0] = 0;

        for(int i = 1; i < n; i ++) {

            int index = i / 2;

            res[i] = a[i]-a[index] + res[i-1];
        }
        return res;
	}
	public static void inputValues(int [] arr, int n) {
		for(int i = 0; i < n; i ++) {
			arr[i] = scn.nextInt();
		}
	}
	public static void printArray(long [] arr, int n) {
		for(int i = 0; i < n; i ++) {
			System.out.print(arr[i] + " ");
		}
	}
}



//Question -- 
//
//Input:
//N=4
//A={1,6,9,12}
//
//Output:
//0 5 8 14
//
//Input:
//N=7
//A={1,1,1,7,7,10,19}
//
//Output:
//0 0 0 6 12 21 33
