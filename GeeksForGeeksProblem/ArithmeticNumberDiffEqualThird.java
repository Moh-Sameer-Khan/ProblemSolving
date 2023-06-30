package com.GeeksForGeeksProblem;

import java.util.Scanner;

public class ArithmeticNumberDiffEqualThird {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("Enter three number : ");
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = scn.nextInt();
			int ans = existOrNotSequence(a, b, c);
			System.out.println("B is exixts or not  : " + ans);
	}
	public static int existOrNotSequence(int A, int B, int C) {
//		if Both A and B is equal then exists
		if(A == B) {
            return 1;
        }else if((A > B && C >= 0) || (B > A && C <= 0)) {
//        	if this case then B doesnot exist
            return 0;
        }else if ((B - A) % C == 0) { 
//        	if this case then B exist
            return 1;
        }else {
//        	other wise not exist
            return 0;
        }
	}
}


//
//Question is -->
//
//Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting the common difference of an arithmetic sequence and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not. Return 1 if B is present in the sequence. Otherwise, returns 0.
//
//Example 1:
//
//Input: A = 1, B = 3, C = 2
//Output: 1
//Explaination: 3 is the second term of the 
//sequence starting with 1 and having a common 
//difference 2.
//Example 2:
//
//Input: A = 1, B = 2, C = 3
//Output: 0
//Explaination: 2 is not present in the sequence.
