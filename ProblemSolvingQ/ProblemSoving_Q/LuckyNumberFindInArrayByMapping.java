package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;
// Lucky Number means like array is 1 2 2 3 3 3 4 5 --> 3 lucky number bcz 1 is one time, 2 is time, 3 is 3 time
public class LuckyNumberFindInArrayByMapping {
	
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array is : ");
		int size = Integer.parseInt(scn.next());
		int[] arr = new int[size];
		inputArray(arr);
		int ans = luckyNumber(arr);
        System.out.println("Total Lucky number is in Array : " + ans);
	}
	public static int luckyNumber(int [] arr) {
//      create Frequency map
     int [] fmap = createFmap(arr);
     int count = 0;
//      check lucky number in array occurance using fmap
     for(int i = 0; i < fmap.length; i ++) {
         if(fmap[i] == i && fmap[i] != 0) {
             count ++;
         }
     }
     if(count == 0) {
         return -1;
     }else {
         return count;
     }
     
     /// or you can use in the place of if elese -->
//     int count = -1; // take
//     and in loop
//     count = i
//     and return count;
    		 
 }
	public static int [] createFmap(int [] arr) {
//      1<=arr[i]<10 // given constraints
     int size = 9; 
     int [] fmap = new int [size];
     for (int i = 0; i < arr.length; i ++) {
         int a = arr[i];
         fmap[a] ++;
     }
     return fmap;
 }
	public static void inputArray(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = scn.nextInt();
		}
	}
}
