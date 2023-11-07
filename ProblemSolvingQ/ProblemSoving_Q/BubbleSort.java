package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class BubbleSort {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter the array Size : ");
        int size = Integer.parseInt(scn.next());
        int [] arr = new int[size];
        System.out.println("Enter the array Values  : ");
        takeInputArrayVal(arr);
        sortBubble(arr);
        printArray(arr);
    }
    
    public static void sortBubble(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i --) { // for iteration 
           for(int j = 0; j < i; j ++) { // for compare adjacent
               if(arr[j] > arr[j + 1]) {
                   swap(arr, j , j + 1);
               }
           }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
    }
    public static void takeInputArrayVal(int [] arr) {
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

