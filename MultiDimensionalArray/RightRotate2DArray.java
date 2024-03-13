package com.MultiDimensionalArray;

import java.util.Scanner;

public class RightRotate2DArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the row and column : ");
//		taking row and column 
		int row = scn.nextInt();
		int column = scn.nextInt();
//		taking array size row and column
		int[][] arr = new int[row][column];
//		calling input method
		inputArray(arr);
		System.out.println("Before Rotating Array is : ");
//		calling print method
		printArray(arr);
//	calling rotate method	
		rotateArray(arr);
		System.out.println("After Rotating Array is : ");
		printArray(arr);
	}
//	method for rotating
	public static void rotateArray(int[][] arr) {
//		for transpose array
		for(int i = 0; i < arr.length; i ++) { // for row
			for(int j = i; j < arr[0].length; j ++) { // for col
				swap(arr, i , j); // swap i , j with j, i
			}
		}
//		for swap columns array
		for(int i = 0; i < arr.length; i ++) { // for row 
			for(int j = 0; j < (arr[0].length / 2); j ++) { // for col. half for swap
				swap(arr, i , j, i, arr[0].length - 1 - j); // swap i,j with i, arr[0].length - 1 - j
			}
		}
	}
//	for transpose swapping with 2 parameters
	public static void swap(int[][] arr, int i, int j) {
		arr[j][i] = ((arr[i][j] + arr[j][i]) - (arr[i][j] = arr[j][i]));
	}
//	for transpose swapping with 4 parameters
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
