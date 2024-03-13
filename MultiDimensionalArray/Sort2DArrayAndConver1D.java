package com.MultiDimensionalArray;

import java.util.Arrays;

public class Sort2DArrayAndConver1D {
	public static void main(String[] args) {
		int [][] arrMat = {
				{12, -3, 16, 8}, 
				{14,-5, 9, -4}, 
				{104, -9, 18, 1}};
		int r = arrMat.length;
		int c = arrMat[0].length;
		System.out.println("Array is 2D -- ");
		printArray(arrMat);
		System.out.println("After Sorting : ");
//		calling sorting 2D array
		int[][] nArr = sortingMultiArray(arrMat,r,c);
		printArray(nArr);
	}
//	Method for sorting 2D array
	public static int[][] sortingMultiArray(int[][] arrMat, int row, int column) {
		int[] narr = convertArrayOneD(arrMat, row, column);
		Arrays.sort(narr); // or use any sorting
		int[][] qArr = convertTwoDArray(narr, arrMat,  row, column);
		return qArr;
	}
//	 Convert 1D array to 2D array
	public static int[][] convertTwoDArray(int [] narr, int [][] arrMat, int row, int column) {
		int[][] marr = new int[row][ column];
		int k = 0;
		for(int i = 0; i < arrMat.length ; i ++) {
			for(int j = 0; j < arrMat[0].length; j ++) {
				marr[i][j] = narr[k];
				k ++;
			}
		}
		return marr;
	}
//	// Convert 2 D array to 1D array
	public static int[] convertArrayOneD(int[][] arrMat, int row, int column) {
		int[] narr = new int[row * column];
		int k = 0;
		for(int i = 0; i < arrMat.length; i ++) {
			for(int j = 0; j < arrMat[0].length; j ++) {
				narr[k] = arrMat[i][j];
				k ++;
			}
		}
//		System.out.println(narr[8]); // 104
		return narr;
	}
//	Print 2D array method
	public static void printArray(int[][] arrMat) {
		for(int i = 0; i < arrMat.length; i ++) {
			for(int j = 0; j < arrMat[0].length; j ++) {
				System.out.print(arrMat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
