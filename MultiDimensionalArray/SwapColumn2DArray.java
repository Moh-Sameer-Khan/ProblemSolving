package com.MultiDimensionalArray;

import java.util.Scanner;
public class SwapColumn2DArray {
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
//		 calling print array method
		 printArray(arr);
//		 calling swapColumn method
		 printSwapColumn(arr);
		 System.out.println("After Swap Column array is : ");
//		 calling print array method
		 printArray(arr);
	}
//	 method for printing values
	public static void printSwapColumn(int[][] arr) {
//		for row 
		for(int i =0; i <  arr.length; i ++) {
//			for column column
			for(int j = 0 ; j < arr[0].length / 2; j ++) {
//				method for swapping 
				swap(arr, i, j , i, arr[0].length - 1 - j);
			}
		}
	}
//	for Swapping
	public static void swap(int[][] arr , int i, int j, int k, int l) { 
		arr[k][l] = ((arr[i][j] + arr[k][l]) - (arr[i][j] = arr[k][l]));
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
