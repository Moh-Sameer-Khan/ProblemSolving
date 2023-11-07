package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class GreatestTillMeByPrefixSum {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size, input values");
		int size = Integer.parseInt(scn.next());
        int [] arr = new int[size];
        takeInputArrayVal(arr);
        findGreatestAndPrint(arr);
    }
    public static void findGreatestAndPrint(int[] arr) {
//         prefix sum
        int [] ps = new int [arr.length];
        ps[0] = arr[0];
//        here we are getting prefix sum but in this question not need prefix need but we can dirctly like below
//        for(int i = 1; i < arr.length; i ++) {
//            ps[i] = ps[i - 1] + arr[i];
//        }
        
//         System.out.println(ps[0]);
//         for(int i = 1; i < arr.length; i ++) {
// //             compare prefix sum from array if prefix sum is max then prefix sum will be same
//             ps[i] = Math.max(ps[i - 1], arr[i]);
//             System.out.println(ps[i]);
//         }
        
        // or
        
        for(int i = 1; i < arr.length; i ++) {
//             compare prefix sum from array if prefix sum is max then prefix sum will be same
            ps[i] = Math.max(ps[i - 1], arr[i]);
        }
//        print after getting max prefix Sum
        for(int i = 0; i < ps.length; i ++) {
            System.out.println(ps[i]);
        }
        
        
    }
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i ++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void takeInputArrayVal(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }

}
