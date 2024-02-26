package com.FS10_HackerRank.ProblemSovingQ;
import java.util.Scanner;
//import java.util.Arrays;

public class MaxProductThreeNumbers {
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter size , input");
		int size = Integer.parseInt(scn.next());
        int [] arr = new int [size];
        inputArray(arr);
        int ans = maxProductThreeNO(arr);
        System.out.println("Max of three numbers is : " + ans);
	}
	public static int maxProductThreeNO(int [] arr) {
        // Arrays.sort(arr); // we can use but not good so use other sorting
        int [] ans = selectionSort(arr);
        int n = ans.length;
        int r1 = ans[0] * ans[1] * ans[n - 1];
        int r2 = ans[n - 3] * ans[n - 2] * ans[n - 1];
//       by inbuilt method
//        return Math.max(r1,r2);
//         or own Method
        if(r1 > r2) {
            return r1;
        }else {
            return r2;
        }
    }
    public static int [] selectionSort(int[] arr) {
        int len = arr.length;
        for(int i = len - 1; i >= 0; i --) {
            int maxIdx = 0;
            for(int j = 0; j <= i; j ++) {
                if(arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            swap(arr, i , maxIdx);
        }
        return arr;
    }
    public static void swap(int[] arr,int i,int  j) {
        arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
    }
   public static void inputArray(int[] arr) {
        for(int i = 0; i <= arr.length -1 ; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}