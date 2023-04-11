package com.LeetCodeProblem;

import java.util.Scanner;

public class CountOddNumbersInRange {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
//		given two numbers 
			System.out.println("Enter the low and high for range : ");
			int low = scn.nextInt();
			int high = scn.nextInt();
			int ans = countTotalOdd(low, high);
			System.out.println("Total Odd is : " + ans);
	}
	public static int countTotalOdd(int low, int high) {
		// total(actual value) = end - start + 1
		int total = high - low + 1;
		 //  Case-1 
        // When low is odd and high is odd 
		if(low % 2 != 0 && high % 2 != 0) {
			 /* Let's assume for a small range - [ odd, even, odd, even, odd ]
            Here, we have extra odd so adding 1 // Ex -- 3 4 5 6 7 -- > 2 + 1 --> 3
            total number of odd numbers are total/2 + 1 
            */
			return total / 2 + 1;
		}else {
			return total / 2;
			 /*Case-2
	         When low is odd and high is even - [ odd, even, odd, even ]
	         no. of odd = no. of even = total/2
	        
	        Case-3
	        When low is even and odd is high - [ even, odd, even, odd ]
	        no. of odd = no. of even = total/2
	        
	        Case-4
	        When low is even and high is even - [ even, odd, even, odd, even ]
	        Here, we have an extra even number but
	        no. of odd numbers = total/2
	        */
		}
	}
}
	
//	Question -->
//	
//	Example 1:
//
//		Input: low = 3, high = 7
//		Output: 3
//		Explanation: The odd numbers between 3 and 7 are [3,5,7].
//		Example 2:
//
//		Input: low = 8, high = 10
//		Output: 1
//		Explanation: The odd numbers between 8 and 10 are [9].
//	

