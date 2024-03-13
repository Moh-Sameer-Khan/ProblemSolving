package com.MultiDimensionalArray;

import java.util.Scanner;

public class BasicsTwoDArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enetr the row and column : ");
//		Taking size of 2D array 
		 int row = scn.nextInt();
		 int col = scn.nextInt();
//		  2 -D Array 
		 int[][] arr = new int[row][col]; // or 
//		int[][] arr = {{2,3,4},{5,6,7}}; // by here 2 row 3 column
//		 method for Taking input form user
		 inputArray(arr);
//		 method for printing values
		 printArray(arr);
		 System.out.println(arr.length); // i or for row
		 System.out.println(arr[0].length); // j or for column
//		 for access value 0,2
		 System.out.println("Access value arr[0][2] is :  " + arr[0][2]);
//		 for update value
		 System.out.println("Update value arr[1][2] is :  " + (arr[1][2] = 25));
	}
//	 method for printing values
	public static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[0].length; j ++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
//	 method for Taking input form user
	public static void inputArray(int[][] arr) {
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[0].length; j ++) {
				arr[i][j] = scn.nextInt();
			}
		}
	}
}
