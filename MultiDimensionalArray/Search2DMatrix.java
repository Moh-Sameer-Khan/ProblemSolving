package com.MultiDimensionalArray;
import java.util.Scanner;
public class Search2DMatrix {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of Array like row and column enter : ");
//		for row input
		int row = scn.nextInt();
//		for column input
		int column = scn.nextInt();
//		initialize 2D array by row and column
		int[][] arr = new int[row][column];
//		taking a serching element 
		System.out.println("Enter a seraching element : ");
		int search = scn.nextInt();
//		calling input mehod for taking values
		System.out.println("Enter the Values of 2 D array : ");
		inputArray(arr);
//		calling print method for print values
		System.out.println("2D Array is : ");
		printArray(arr, row, column);
//		calling searching Method for find element
		int[] array = searchElement(arr, search);
		System.out.println("Searching element index is : " + "(" + array[0] + ", " + array[1] + ")");
	}
//	searching method for find the element in the array
	public static int[] searchElement(int[][] arr, int search) {
		int ansRow = -1;
		int ansCol = -1;
		a : for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[0].length; j ++) {
				if(arr[i][j] == search) {
//					int[] ans = new int[2];
//					ans[0] = i;
//					ans[1] = j;
//					return ans; // this return only when condition true so we will take another return for false condition down
					
					/////// or
//					return new int[] {i, j}; // for if interviewer want only one return then remove it
					ansRow = i;
					ansCol = j;
//					break;// its only this for loop break if we want both loop break then use a 
					break a;
				}
			}
		}
//		int[] ans = new int[2];
//		ans[0] = -1;
//		ans[1] = -1;
//		return ans;
		
		////// or
//		return new int[] {-1, -1};
		/// by 3 way
		return new int[] {ansRow, ansCol};
	}
//	input method for taking input
	public static void inputArray(int[][] arr) {
		for(int i = 0; i < arr.length; i ++) { 
			for(int j = 0; j < arr[0].length; j ++) {
				arr[i][j] = scn.nextInt();
			}
		}
	}
//	print method for print values
	public static void printArray(int[][] arr, int row, int column) {
		for(int idx = 0; idx < row * column; idx ++) {
			int i = idx / arr[0].length;
			int j = idx % arr[0].length;
			System.out.print(arr[i][j] + " ");
		}
	}
}
