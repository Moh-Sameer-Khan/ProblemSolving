package com.GeeksForGeeksProblem;

import java.util.Scanner;
// Question below
public class MinOperationToEqual {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two numbers : ");
			int a = scn.nextInt();
			int b = scn.nextInt();
			int ans = countMinOperation(a, b);
			System.out.println("Total count to equal numbers is : " + ans);
	}
	public static int countMinOperation(int a, int b) {
		/// Method 1
		
//        if(a == b) {
//            return 0;
//        }
//        if((a | b) == a || (a | b) == b) { // (a | b) --> bracket is compulsory 
//            return 1;
//        }else {
//            return 2;
//        }
		
//		method 2
		
		if(a == b)
	        return 0;
	        if((a&b)==Math.min(a,b))
	        return 1;
	        return 2;
	}
}


// Question

//Input:
//a = 5, b = 12
//Output:
//2
//Explanantion:
//In first operation replace 
//a = a&4 = 4
//after that replace 
//b = b&6 = 4
//Hence both are same after applying two
//operations.
