package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class ArrayPrintPrimeNumbers {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size array, input array values ");
		int n = scn.nextInt();
        int [] arr = new int[n];
        inputArray(arr);
        printPrimeNumber(arr);
	}
	
	 public static void printPrimeNumber(int [] arr) {
	        for(int i = 0; i < arr.length; i++) {
	            boolean isPrime = true;
	            for(int j = 2; j < arr[i]; j ++) {
	                if(arr[i] % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if(isPrime) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	    public static void inputArray(int [] arr) {
	        for(int i = 0; i < arr.length; i ++) {
	            arr[i] = scn.nextInt();
	        }
	    }
}
