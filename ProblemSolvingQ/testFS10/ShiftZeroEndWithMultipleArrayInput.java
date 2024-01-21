package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class ShiftZeroEndWithMultipleArrayInput {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the test cases");
		int t = scn.nextInt();
//		here will be multiple array and input of array size
		for(int j = 1; j <= t; j ++) {
			System.out.println("Enter the size of every case");
            int n = scn.nextInt();
            int [] arr = new int [n];
            inputArr(arr);
            sortZero(arr);
        }
        
	}
	public static void sortZero(int [] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] != 0) {
                System.out.print(arr[i] + " ");
                count ++;
            }
        }
        while(count < arr.length) {
            System.out.print("0" + " ");
            count ++;
        }
        System.out.println();
    }
    public static void inputArr(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}
