package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class ArrayFormSmallestNumber {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size Array, input values Array ");
//      Size of Array 
      int size = Integer.parseInt(scn.next());
//      input array size 
      int[] arr = new int[size];
      inputArray(arr);
      constructSmallestNumber(arr);
	}

	public static void constructSmallestNumber(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            for(int j = i + 1; j < arr.length; j ++) {
                if(compareNumber(arr[i], arr[j]) > 0) {
                    int temp = arr[i]   ;
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArrNumber(arr);
    }
    public static void printArrNumber(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i]);
        }
    }
    public static int compareNumber(int num1, int num2) {
        String s1 = Integer.toString(num1);
        String s2 = Integer.toString(num2);
        return (s1 + s2).compareTo(s2 + s1);
    }
    public static void inputArray(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}
