package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class SortArrayUsingFreqDecresingOrder {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter size and input array values : ");
      int size = Integer.parseInt(scn.next());
        int[] arr = new int[size];
        inputArray(arr);
        sortByFreqMap(arr);
    }
    public static void sortByFreqMap(int[] arr) {
//         create frequency map
        int [] fmap = createFreqMap(arr);
        int k = 0;
        for(int i = fmap.length - 1; i >= 0; i --) {
            int val = i;
            int freq = fmap[i];
            for(int j = 0; j < freq; j ++) {
                System.out.print((arr[k] = val) + " ");
                k ++;
            }
        }
    }
    public static int [] createFreqMap(int [] arr) {
        int size = 10; // given in constriants
        int [] fmap = new int [size];
        for(int i = 0; i < arr.length; i ++) {
            int val = arr[i] ;
            int sv = val ;
            fmap[sv] ++;
        }
        return fmap;
    }
    public static void inputArray(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}


//Question 
//
//Sample Input 0
//
//10
// 9 7 8 9 8 9 8 7 7 8
//Sample Output 0
//
//9 9 9 8 8 8 8 7 7 7 
