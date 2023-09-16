package com.LeetCodeProblem;

//import java.util.Arrays;
import java.util.Scanner;

public class ArrayRemoveElement {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(scn.next());
		int [] arr = new int[size];
		System.out.println("Enter array values : ");
		inputArray(arr);
		System.out.println("Enter remove ele : ");
		int val = scn.nextInt();
		System.out.println("Before Removig element : ");
		printArray(arr);
		int ans = removeEle(arr, val);
		System.out.println("Remove element is : " + ans);
		System.out.println();
		System.out.println("After Removig element : ");
		printArray(arr);
	}
	public static int removeEle(int [] nums, int val) {
		  // taking a variable for count how many elements are not equal to given value
        int k = 0; 
        // simple for loop for traversal in the array
        for (int i = 0; i< nums.length ;i++){
            // condition for if element of the array is not equal to the val put value in the array and k increase
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        // return the final remaining value in the array
        return k;
	}
	 public static void inputArray(int [] arr) {
	        for(int i = 0; i < arr.length; i ++) {
	            arr[i] = scn.nextInt();
	        }
	  }
	 public static void printArray(int [] arr) {
	        for(int ele : arr) {
	        	System.out.print(ele + " ");
	        }
	  }
}
