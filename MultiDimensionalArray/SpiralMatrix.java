package com.MultiDimensionalArray;

import java.util.Scanner;

public class SpiralMatrix {
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
		 spiralMatrix(arr, row, col);
	}
	public static void spiralMatrix(int [][] arr, int r, int c) {
//		for row
		int minR = 0;
		int maxR = arr.length - 1;
//		for column
		int minC = 0;
		int maxC = arr[0].length - 1;
//		System.out.println(maxR);
//		System.out.println(maxC);
		int total = r * c; // find total element in matrix
		int tnp = 0; // total no. print
		while(tnp < total) {
//			for Path - 1
//			here Min row will be constant and column will be changed
			for(int j = minC; j <= maxC && tnp < total; j ++) {
				System.out.print(arr[minR][j] + " "); // bcz minR is constant 
				tnp ++;
			}
			minR ++;
//			for Path - 2
//			Here Max column will be constant and row will be change
			for(int i = minR; i <= maxR && tnp < total; i ++) {
				System.out.print(arr[i][maxC] + " ");
				tnp ++;
			}
			maxC --;
//			for Path - 3
//			Here Max row will be constant and col will be change
			for(int j = maxC; j >= minC && tnp < total; j --) {
				System.out.print(arr[maxR][j] + " ");
				tnp ++;
			}
			maxR --;
//			for Path - 4
//			Here  Min col will be constant and row will be change
			for(int i = maxR; i >= minR && tnp < total; i --) {
				System.out.print(arr[i][minC] + " ");
				tnp ++;
			}
			minC ++;
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
