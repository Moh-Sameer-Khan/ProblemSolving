package com.LeetCodeProblem;

public class ArrayRemoveDuplicacyCount {
	public static void main(String[] args) {
		 // // Method - 1 here only count to remove duplicacy
		
//	        int [] arr = {1,1,2};
	         int [] arr = {0,0,1,1,1,2,2,3,3,4};
//			int [] arr = {0, 1, 1, 2, 2, 3, 8, 24, 24, 35, 123, 123};
	        int ans = removeDuplicacy(arr);
	        System.out.println("Total count to remove duplicacy is : " + ans);
	}
	public static int removeDuplicacy(int [] arr) {
		 int n = arr.length;
         int val = 1;
         for(int i = 0; i < n - 1; i ++) {
           if(arr[i] < arr[i + 1]) {
               arr[val] = arr[i + 1];
               val += 1;
           }
         }

       System.out.println(val);
       for(int i = 0; i < n; i ++) {
           System.out.print(arr[i] + " ");
       }
     return val;
	}
}
