package com.FS10_HackerRank.ProblemSovingQ;
//import java.io.*;
import java.util.*;
public class FindDifferenceAbsolute {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(scn.next());
        int [] arr = new int[size];
        takeInputArrayVal(arr);
        int targetDiff = scn.nextInt();
        findTargetDifference(arr, targetDiff);
    }
    public static void findTargetDifference(int[] arr, int targetDiff) {
        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr.length; j ++) {
//                if((arr[i] - arr[j] == targetDiff || (arr[j] - arr[i] == targetDiff))) {
            	if(Math.abs(arr[i] - arr[j] ) == targetDiff) { // Math.abs gives + ve value like -3 will be 3
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
    public static void takeInputArrayVal(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}  
