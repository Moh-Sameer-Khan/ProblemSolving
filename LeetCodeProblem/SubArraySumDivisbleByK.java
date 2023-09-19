package com.LeetCodeProblem.POTD;

import java.util.Scanner;

public class SubArraySumDivisbleByK {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size , input, Input divisible value");
		int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        inputArray(arr);
        int k = scn.nextInt();
        int ans = subarraysDivByK(arr, k);
        System.out.println("Total SubArrays Who Divisible By K is : " + ans);
	}
	public static int subarraysDivByK(int[] nums, int k) {
//		/// Methdo - 1 --> Simple solved  but TLE in leetCode
//	        int sum = 0;
//	        int count = 0;
//	        for(int i = 0 ; i < nums.length ; i++){
//	            sum = 0;
//	            for(int j = i ; j < nums.length ; j++){
//	                sum += nums[j];
//	                if(sum % k == 0){
//	                    count++;
//	                }
//	            }
//	        }
//	        return count;
		
//		/// Method - 2 for leet code from Mapping
		int  res = 0, cummSum = 0;
        int map[] = new int[k];
        map[0] = 1;
        for(int num: nums) {
            cummSum += num % k;
            cummSum = (cummSum < 0)? (cummSum + k) % k: cummSum % k;
            res += map[cummSum]++;
        }
        return res;
	   }
	  public static void inputArray(int [] arr) {
	        for (int i = 0; i < arr.length; i ++) {
	            arr[i] = scn.nextInt();
	        }
	    }
}
