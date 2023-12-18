package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class FindSingleElemnetArrayMappingForLoop {
	 public static Scanner scn = new Scanner(System.in);
	    public static void main(String[] args) {
	    	System.out.println("Enter size , values : ");
	      int size = Integer.parseInt(scn.next());
	        int[] arr = new int[size];
	        inputArray(arr);
	        int ans = findSingleFreq(arr);
	        System.out.println(ans);
	        // printArray(arr);
	    }
	    public static int findSingleFreq(int[] arr) {
//	         method 1  // incomplete not proper answer
	        
//	         create frequency map
	        // int [] fmap = createFreqMap(arr);
	        // for(int i = 0; i < fmap.length; i ++) {
	        //     if(fmap[i] == 1 && arr.length != 0) {
	        //         return i;
	        //     }
	        // }
	        // return -1;
	        
//	         method 2
	        
	        for(int i = 0; i < arr.length; i ++) {
	            int count = 0;
	            for(int j = 0; j < arr.length; j ++) {
	                if(arr[i] == arr[j]) {
	                    count ++;
	                }
	            }
	            if(count == 1){
	                return arr[i];
	            }
	        }
	        return -1;
	    }
	    
	    // public static int [] createFreqMap(int [] arr) {
	    //     int size = 10; // given in constriants
	    //     int [] fmap = new int [size];
	    //     for(int i = 0; i < arr.length; i ++) {
	    //         int val = arr[i];
	    //         int sv = val;
	    //         fmap[sv] ++;
	    //     }
	    //     return fmap;
	    // }
	    
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
//7
//1 2 3 4 3 2 1
//Sample Output 0
//
//4
//Explanation 0
//
//As 4 is occured only once.