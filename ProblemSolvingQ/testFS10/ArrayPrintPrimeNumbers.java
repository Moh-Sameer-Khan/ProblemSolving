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


// right solution its not include 1 as prime number


// public class Main {
//     public static void main(String[] args) {
//         int [] arr = {1, 3, 4, 5, 7,9,11,23,27,39,67,61,21};
//         List<Integer> list = primeSearch(arr);
//         System.out.print(list);
//     }
//     public static List<Integer> primeSearch(int [] arr) {
//         List<Integer> list = new ArrayList<>();
//         for(int i = 0; i < arr.length; i ++) {
//             if(checkPrime(arr[i])) {
//                 list.add(arr[i]);
//             }
//         }
//         return list;
//     }
//     public static boolean checkPrime(int ele) {

	// if(ele <= 1) {
	// 	return false;
	// }
//         // boolean b = true;
//         for(int i = 2; i < ele; i++) {
//             if((ele % i) == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
