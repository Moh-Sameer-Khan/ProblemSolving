package com.FS10_HackerRank.ProblemSovingQ;
import java.util.Scanner;
public class SubArrayMaximumSum {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	// Method 1 -- O(n^3) & O(1)
//    	Method 2 -- O(n) & O(1)
//    	Method 3 -- O(n) & O(1) // Using method 2 and 3 Kadane Algo
        int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        inputArray(arr);
        int ans = findMaxSumSubArray(arr);
        System.out.println("Max Sub Array By Kadani's Algo. " + ans);
    }
    
//    Method 1 simple
    
//    public static int findMaxSumSubArray(int [] arr) {
//        int len = arr.length;
//        int maxSub = 0;
//        for(int st = 0; st < len; st ++) {
//            for(int end = st; end < len; end ++) {
////               printSubArray(arr, st, end);
//            	int sum = calculateSum(arr, st, end);
//                    if(sum > maxSub) {
//                        maxSub = sum;
//                    }
//            }
//        }
//        return maxSub;
//    }
//    
////   for sum of all subarray
//    public static int calculateSum(int [] arr, int st, int end) {
//    	int sum = 0;
//    	for(int i = st; i <= end ; i ++) {
//            sum += arr[i];
//    	}
//    	return sum;
//    }
    
    
//    Method 2 -- O(n)
//    But here we are getting only simple maximum sum
//    public static int findMaxSumSubArray(int [] nums) {
//    	 int sum = 0;
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < nums.length; i++){
//             sum += nums[i];
//             if(max < sum)
//                 max = sum;
//             if(sum < 0)
//                 sum = 0;
//         }
//         return max;
    
//    Method 3rd class- 
    public static int findMaxSumSubArray(int [] nums) {
   	 int sum = 0; 
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
//        	Ex - loan family -- and me  // agar hmara next elemnet have better than (-ve valuse)previous than we start form next leave previous
        	// its good bcz our +ve then add previous sum 
            if(sum >= 0) {
            	sum += nums[i];
            }else {
//            	bcz out element get -ve so its better its leave 
            	sum = nums[i];
            }
            if(max < sum)
                max = sum;
        }
        return max;
    }
    
    
    public static void inputArray(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
//    for print subarray
//    public static void printSubArray(int [] arr, int st, int end) {
//        for(int i = st; i <= end; i ++) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//    }
}

