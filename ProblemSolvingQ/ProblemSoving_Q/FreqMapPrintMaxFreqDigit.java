package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class FreqMapPrintMaxFreqDigit {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter size , input");
        int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        inputArray(arr);
        int ans = findMaxFreq(arr);
        System.out.println(ans);
    }
    public static int findMaxFreq(int [] arr){
//         create freq Map
        int [] fmap = createFrqMap(arr);
//        imagine max is 0
        int max = 0;
//        imaigine that max digit is index 0
        int ansDigit = arr[0];
//        we will work on array so traversal on array
        for(int i = 0; i < arr.length; i ++) {
            int digit = arr[i];
            if(fmap[digit] > max) {
//            	if freq is change then change max and also digit
                max = fmap[digit];
                ansDigit = arr[i];
            }
        }
        return ansDigit;
    }
    public static int [] createFrqMap(int [] arr) {
        int len = 10; // given in question
        int [] fmap = new int [len];
        for(int i = 0; i < arr.length; i ++) {
            int a = arr[i];
            // int sv = arr[i];
            fmap[a] ++;
        }
        return fmap;
    }
    public static void inputArray(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}
