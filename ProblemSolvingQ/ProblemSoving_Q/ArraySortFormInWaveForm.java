package com.FS10_HackerRank.ProblemSovingQ;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySortFormInWaveForm {
	
	public static Scanner scn = new Scanner(System.in);
	
    public static void main(String[] args) {
    	System.out.println("Enter the size of the array is : ");
        int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        System.out.println("Enter the values of the array is : ");
        inputArray(arr);
        printSortedWaveForm(arr);
        printArray(arr);
    }   
    public static void printSortedWaveForm(int [] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i += 2) {
            swap(arr, i, i + 1) ;
        }
    }
    public static void swap(int [] arr, int i , int j) {
        arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
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

//7
//10 90 49 2 1 5 23
//output -- > 
//2 1 10 5 49 23 90 