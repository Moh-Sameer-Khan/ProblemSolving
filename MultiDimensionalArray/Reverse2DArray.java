package com.MultiDimensionalArray;

import java.util.Scanner;

public class Reverse2DArray {
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
		 printReverseArray(arr);
	}
	
////	 method 1--  method for reverse array // but by reverse loop
//	public static void printReverseArray(int[][] arr) {
////		for row reverse
//		for(int i = arr.length - 1; i >= 0; i --) {
////			for column reverse
//			for(int j = arr[0].length - 1 ; j >= 0; j --) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
	
//	Method 2 --- By swaping row swap and column swap
	
	public static void printReverseArray(int [][] arr) {
		swapCol(arr);
		swapRow(arr);
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[0].length; j ++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
//	Method for row Swap
	public static void swapCol(int [][] arr) {
		for(int i = 0; i < arr.length; i ++) {
			int st = 0;
			int end = arr[0].length - 1; 
			for(int j = st; j <= end; j ++) { // use while(st < end)
				swap(arr, i, st, i, end);
				st ++; 
				end --;
			}
		}
	}
// Method for Column Swap
	public static void swapRow(int [][] arr) {
		for(int i = 0; i < arr[0].length; i ++) {
			int st = 0;
			int end = arr.length - 1; 
			for(int j = st; j <= end; j ++) { // use while(st < end)
				swap(arr, st, i, end, i);
				st ++;
				end --;
			}
		}
	}
//	method for swap
	public static void swap(int[][] arr, int i, int j, int k, int l) {
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
}
