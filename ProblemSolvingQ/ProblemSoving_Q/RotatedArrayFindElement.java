package com.FS10_HackerRank.ProblemSovingQ;


import java.util.Scanner;

public class RotatedArrayFindElement {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size : ");
		int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        System.out.println("Enter Values array is  : ");
        inputArray(arr);
        System.out.println("Enter Searching values : ");
        int search = scn.nextInt();
        int ans = searchRotateIndex(arr, search);
        System.out.println("rotated times is : " + ans);

	}
	 public static int searchRotateIndex(int[] arr, int val) {
	        for(int i = 0; i < arr.length; i ++) {
	            if(arr[i] == val) {
	                return i;
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

