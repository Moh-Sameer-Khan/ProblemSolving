package com.MultiDimensionalArray;

//import java.io.*;
import java.util.*;
public class PrintAlternateColumnOutputRowWise {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int r = Integer.parseInt(scn.next());
        int c = Integer.parseInt(scn.next());
        int [][] arr = new int[r][c];
        takeInputTwoDArrayVal(arr);
        printAlternateColTwoD(arr);
    }
    public static void printAlternateColTwoD(int[][] arr) {
       for(int i = 0; i < arr[0].length; i += 2) { //for even row
           for(int j = 0; j < arr.length; j ++) {
              System.out.print(arr[j][i] + " "); 
           }
           System.out.println();
       }
    }
   
    public static void takeInputTwoDArrayVal(int[][] arr) {
        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr[0].length; j ++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
}  
