package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraySortCubesElement {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size array, input array values ");
		int n = scn.nextInt();
        int [] arr = new int[n];
        inputArray(arr);
        printSortedCubeArray(arr);
	}
	
	public static void printSortedCubeArray(int [] arr) {
        int len = arr.length;
        Integer [] iArr = new Integer[len];
        for(int i = 0; i < len; i ++) {
            iArr[i] = arr[i];
        }
//             sort the Array 
            Arrays.sort(iArr, new Comparator<Integer>() {
               public int compare(Integer n1, Integer n2) {
//                    finding cube
                   int a = (int)Math.pow(n1, 3);
                   int b = (int)Math.pow(n2, 3);
                   return (a < b) ? -1 : 1;
               }
            });
//             calling print Array Mehod
             printArray(iArr);      
    }
    public static void printArray(Integer [] iArr) {
        for(int i = 0; i < iArr.length; i ++)  {
            System.out.print(iArr[i] + " "); 
        }
    }
    public static void inputArray(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();

        }
    }
}
