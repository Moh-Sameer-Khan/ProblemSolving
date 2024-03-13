package com.MultiDimensionalArray;

import java.util.Scanner;
public class Print2DArrayBySingleLoop {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enetr the row and column : ");
//		Taking size of 2D array 
		 int row = scn.nextInt();
		 int col = scn.nextInt();
//		  2 -D Array  
		 int[][] arr = new int[row][col];
//		 method for Taking input form user
		 inputArray(arr);
//		 method for printing values
//		 System.out.println();
		 System.out.println("Print array is : ");
		 printArray(arr);
		 System.out.println("Short complexity array is : ");
		 printArray(arr, row, col);
	}
//	 method for printing values
	public static void printArray(int[][] arr, int row, int column) {
//		for total values row * column
		for(int idx = 0; idx <  row * column; idx ++) {
//			idx = i * column + j; // where i -> quotient (row) , j --> remainder(column)
//			Example 8 = 2 * 3 + 2; where 2 quotient and other 2 is remainder
			int i = idx / arr[0].length; // quotient 
			int j = idx % arr[0].length;// remainder
			System.out.println(arr[i][j] + " ");
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
//	 method for printing values
	public static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[0].length; j ++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
