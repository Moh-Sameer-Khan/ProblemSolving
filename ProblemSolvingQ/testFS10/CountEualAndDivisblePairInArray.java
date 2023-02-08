package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class CountEualAndDivisblePairInArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size, values, pair divisble");
		int n = scn.nextInt();
        int [] arr = new int [n];
        inputArr(arr);
        int t = scn.nextInt();
        int ans = countPair(arr,t);
        System.out.print(ans);
	}
	public static int countPair(int [] nums, int k) {
        int count = 0;
        for(int i = 0; i <nums.length; i ++) {  
            for(int j = i + 1; j <nums.length; j ++) {  
                if(nums[i] == nums[j] && (( i * j) % k == 0 )) {
                    count ++;
                }
            }
        }
        return count;
    }
    public static void inputArr(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}


//Question -->
//first line contains an integer representing size of the array. next n line contains n elements of the array. last line contains an integer k.
//Sample Input 0
//
//7
//3
//1
//2
//2
//2
//1
//3
//2
//Sample Output 0
//
//4
//Explanation 0
//
//There are 4 pairs that meet all the requirements:
//
//nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
//
//nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
//
//nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
//
//nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.