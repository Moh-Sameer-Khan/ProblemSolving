package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class FindDuplicateWithFrequencyMapping {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter size, values : ");
      int size = Integer.parseInt(scn.next());
        int[] arr = new int[size];
        inputArray(arr);
        printDuplicateFreq(arr);
    }
    public static void printDuplicateFreq(int[] arr) {
//         create frequency map
        int [] fmap = createFreqMap(arr);
        for(int i = 0; i < fmap.length; i ++) {
            if(fmap[i] > 1) {
                System.out.println(i + "->" + fmap[i]);
            
            }
        }
        // System.out.println(-1);
    }
    public static int [] createFreqMap(int [] arr) {
        int size = 10; // given in constriants
        int [] fmap = new int [size];
        for(int i = 0; i < arr.length; i ++) {
            int val = arr[i];
            int sv = val;
            fmap[sv] ++;
        }
        return fmap;
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void inputArray(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}

//
//Question 
//
//Sample Input 0
//
//6
//1 2 2 3 3 3
//Sample Output 0
//
//2->2
//3->3