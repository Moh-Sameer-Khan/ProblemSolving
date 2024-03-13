package com.MultiDimensionalArray;

import java.util.Scanner;

public class SumIndices2DArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of Array like row and column");
//		for row
		int row = scn.nextInt();
//		for column
		int column = scn.nextInt();
//		initialize Array
		int[][] arr = new int[row][column];
//		input method calling
		System.out.println("Enter array Values : ");
		inputArray(arr);
		System.out.println("Print array Values : ");
		printArray(arr);
//		Calling sum method
		int[][] ans = sumMatrix(arr);
		System.out.println("Sum of 2D array Indices is  : " );
		printArray(ans);
	}
//	add two matrix method
	public static int[][] sumMatrix(int[][] arr) { 
		int sum = 0; // initialize sum 0
		int r = arr.length;
		int c = arr[0].length;
		int[][] ans = new int[r][c];
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[0].length; j ++) {
//				adding here
				ans[i][j] = sum + (i + j);
			}
		}
		return ans;
	}
//	for taking values array First
	public static void inputArray(int[][] arrFirst) {
		for(int i = 0; i < arrFirst.length; i ++) {
			for(int j = 0;  j < arrFirst[0].length; j ++) {
				arrFirst[i][j] = scn.nextInt();
			}
		}
	}
//	for Printing Values Array
	public static void printArray(int[][] arrFirst) {
		for(int i = 0; i < arrFirst.length; i ++) {
			for(int j = 0;  j < arrFirst[0].length; j ++) {
				System.out.print(arrFirst[i][j] + " ");
			}
			System.out.println();
		}
	}
}
