package com.GeeksForGeeksProblem;

import java.util.Scanner;
//Queastion
//7
//1 7 4 4 8 3 7
//2 -- serching occ
// First Occ. in array is  : 4


public class FirstElementOccursKTimes {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size , input, Input divisible value");
		int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        inputArray(arr);
        int val = scn.nextInt();
        int  ans = occursKTimes(arr, val);
        System.out.println(" First Occ. in array is  : " + ans );
	}
	public static int  occursKTimes(int[] a, int k) {
		// check given in constrians --> 1<= A[i] <= 200
        // taking a frequrncy unordered map
        int [] fmap = new int [200];
        // traversal on given array
        for(int i = 0; i < a.length; i ++) {
            int j = a[i];
            // increase the map frequency
            fmap[j] ++;
            /// checking given condition
            if(fmap[j] == k) {
                // return array occurance who equal k given value
                return a[i];
            }
        }
        return -1;
	  }
	  public static void inputArray(int [] arr) {
	        for (int i = 0; i < arr.length; i ++) {
	            arr[i] = scn.nextInt();
	        }
	    }
}
