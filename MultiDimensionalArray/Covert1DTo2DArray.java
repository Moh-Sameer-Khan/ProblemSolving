package com.MultiDimensionalArray;

import java.util.Scanner;

public class Covert1DTo2DArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size , input values, row and col");
		int size = Integer.parseInt(scn.nextLine());
        int[] arr = new int[size];
        inputArray(arr);
//         taking row and column for 2D array
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] ans = crateTwoDArray(arr, r, c);
        printArray(ans);
	}
	public static int [][] crateTwoDArray(int [] arr, int row, int col) {
        int [][] ans = new int[row][col];
        int k = 0;
        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < col; j ++) {
                ans [i][j] = arr[k];
                k ++;
            }
        }
        return ans;
    }
    public static void printArray(int [][] ans) {
        for(int i = 0; i < ans.length; i ++) { 
            for(int j = 0; j < ans[0].length; j ++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
//  taking input
     public static void inputArray(int [] ans) {
        for(int i = 0; i < ans.length; i ++){
            ans[i] = scn.nextInt();
        }
    }
}
