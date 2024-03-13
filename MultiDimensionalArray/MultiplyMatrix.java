package com.MultiDimensionalArray;

import java.util.Scanner;

public class MultiplyMatrix {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter row1, col1 & input and then same for 2nd Matrix : ");
		int r1 = scn.nextInt() ;
        int c1 = scn.nextInt() ;
        int [][] a = new int [r1][c1];
        inputArray(a);
//         for second array 2D
        int r2 = scn.nextInt() ;
        int c2 = scn.nextInt() ;
        int [][] b = new int [r2][c2];
        inputArray(b);
//         multiply method
        int [][] c = multiplyMatrix(a, b);
         printArray(c);
	}
//  multiply
 public static int [][] multiplyMatrix(int [][] a, int [][] b) {
     int m = a.length;
     int n = a[0].length;
     int p = b.length;
     int q = b[0].length;
     if(n != p) {
//          return null; // will come error
         return new int[0][0];
         // return -1;
     }
     int [][] ans = new int[m][q];
     for(int i = 0; i < m; i ++) {
         for(int j = 0; j < q; j ++) {
             for(int k = 0; k < n; k ++) {
                 ans [i][j] += (a[i][k] * b[k][j]);
             }
         }
     }
     return ans;
 }
//  Print Arrays
 public static void printArray(int [][] ans) {
     for(int i = 0; i < ans.length; i ++) {
         for(int j = 0; j < ans[0].length; j ++) {
             System.out.print(ans[i][j] + " ");
         }
         System.out.println();
     }
 }
//  taking input
 public static void inputArray(int [][] ans) {
     for(int i = 0; i < ans.length; i ++) {
         for(int j = 0; j < ans[0].length; j ++) {
             ans[i][j] = scn.nextInt();
         }
     }
 }
}
