package com.FS10_HackerRank.ProblemSovingQ;
//import java.io.*;
//import java.util.*;
import java.util.Scanner;

public class OccuranceTwice2Arrays {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter the size Array 1: ");
        int size1 = Integer.parseInt(scn.next());
        int [] arr1 = new int[size1];
        System.out.println("Enter the Array 1 Values : ");
        takeInputArrayVal(arr1);
        System.out.println("Enter the size Array 2 : ");
        int size2 = Integer.parseInt(scn.next());
        int [] arr2 = new int[size2];
        System.out.println("Enter the  Array 2 Values : ");
        takeInputArrayVal(arr2);
        findTwiceOccurance(arr1, arr2);
    }
    public static void takeInputArrayVal(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
    public static void findTwiceOccurance(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i ++) {
            int count = 0;
           for(int j = 0; j < arr2.length; j ++) {
               if(arr1[i] == arr2[j]) {
                   count ++;
               }
           }
            if(count == 2) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
