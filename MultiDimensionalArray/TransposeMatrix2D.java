package com.MultiDimensionalArray;

import java.util.Scanner;
// Transpose only in square matrix ( row = column)
public class TransposeMatrix2D {
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
		 printTransposeArray(arr);
		 System.out.println("After Transpose array is : ");
		 printArray(arr);
	}
//	 method for printing values
	public static void printTransposeArray(int[][] arr) {
//		for row 
		for(int i =0; i <  arr.length; i ++) {
//			for column column
			for(int j = i ; j < arr[0].length; j ++) {
//				method for swapping 
				swap(arr, i, j);
			}
		}
	}
	public static void swap(int[][] arr , int i, int j) { 
		arr[j][i] = ((arr[i][j] + arr[j][i]) - (arr[i][j] = arr[j][i]));
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
