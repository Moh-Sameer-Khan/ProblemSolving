package com.MultiDimensionalArray;

public class PrintColumnInMatrix {
	public static void main(String[] arg) {
		int [][] nums = {
				{8,8,1,2,2},
				{1,7,9,5,9},
				{2,9,8,3,2},
				{3,6,4,0,1}
		};
		printColumn(nums);
	}
	public static void printColumn(int [] [] nums) {
		for(int i = 0; i < nums[0].length; i ++) {
			for(int j = 0; j < nums.length; j ++) {
				System.out.print(nums[j][i] + " ");
			}
			System.out.println();
		}
	}
	
}
