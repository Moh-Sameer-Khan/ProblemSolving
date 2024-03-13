package com.MultiDimensionalArray;

import java.util.Scanner;

public class Add2Matrix {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of Array like row and column");
//		for row
		int row = scn.nextInt();
//		for column
		int column = scn.nextInt();
//		initialize two Arrays
		int[][] arrFirst = new int[row][column];
//		input method calling
		System.out.println("Enter first array Values : ");
		inputArray(arrFirst);
		int[][] arrSecond = new int[row][column];
//		input method calling
		System.out.println("Enter Second array Values : ");
		inputArray(arrSecond);
		System.out.println("Print first array Values : ");
		printArray(arrFirst);
		System.out.println("Enter Second array Values : ");
		printArray(arrSecond);
		int[][] sum = addMatrix(arrFirst, arrSecond);
		System.out.println("After Adding two Matrix is : ");
		printArray(sum);
	}
//	add two matrix method
	public static int[][] addMatrix(int[][] arrFirst, int[][] arrSecond) { // pass both 2D - array
//		row 
		int row = arrFirst.length;
//		column
		int column = arrFirst[0].length;
//		initialize new 2D array for sum
		int[][] ans = new int[row][column];
		for(int i = 0; i < row; i ++) {
			for(int j = 0; j < column; j ++) {
//				adding here
				ans[i][j] = arrFirst[i][j] + arrSecond[i][j];
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
