package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;
//import java.util.*;
public class GreaterThanMeFromIndex {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = Integer.parseInt(scn.next());
        int [] arr = new int[size];
        takeInputArrayVal(arr);
        countGreaterFromIndex(arr);
    }
    public static void countGreaterFromIndex(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            int count = 0;
            for(int j = 0; j < arr.length; j ++) {
                if(arr[i] < arr[j] && i != j) {
                    count ++;
                }
                
            }
            System.out.print(count + " ");
        }
    }
    public static void takeInputArrayVal(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}  

// Explanation
//7 -- len
//4 0 34 76 2 1 -3 -- arr
//2 5 1 0 3 4 6 -- grater with index output like 4 is grater 34 and 76 means 2
