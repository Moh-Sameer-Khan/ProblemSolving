package com.FS10_HackerRank.ProblemSovingQ;
import java.util.Scanner;
public class BinarySerach {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter size : ");
        int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        System.out.println("Enter values : ");
        inputArray(arr);
        System.out.println("Enter search ele.  ");
        int search = scn.nextInt();
        int ans = binarySearch(arr, search );
        System.out.println(ans);
    }
    public static int binarySearch(int [] nums, int k) {
        int st = 0;
        int end = nums.length - 1;
        int mid = (st + end) / 2;
        
        // Methoe 1 --
        // for(int i = 0; i < len; i ++) {
            // if(nums[mid] > k) {
            //     end = mid - 1;
            // }else if(nums[mid] < k) {
            //     st = mid + 1;
            // }else if (nums[mid] == k){
            //     // return i;// or 
            //     return mid;
            // }
            // mid = (st + end) / 2;
        // }
        
        // Method 2
        while(st <= end) {
            if(nums[mid] > k) {
                end = mid - 1;
            }else if(nums[mid] == k) {
                return mid;
            }else{
                st = mid + 1;
            }
            mid = (st + end) / 2;
        }
         return -1;
    }
    public static void inputArray(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}
