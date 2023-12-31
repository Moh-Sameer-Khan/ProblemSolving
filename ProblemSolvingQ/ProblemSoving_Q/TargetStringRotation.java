package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class TargetStringRotation {
	 public static Scanner scn = new Scanner(System.in);
	    public static void main(String[] args) {
	    	System.out.println("Enter two string first string second target String . ");
	        String str1 = scn.nextLine();
	        String target = scn.nextLine();
	        boolean ans = targetString(str1, target);
	        if(ans) {
	            System.out.println("True");
	        } else {
	            System.out.println("False");
	        }
	    }
	    public static boolean targetString(String s1, String t) {
	        int len1 = s1.length();
	        int len2 = t.length();
	        if(len1 != len2) {
	            return false;
	        }
//	         if length same then 
	        for(int i = 0; i < len1; i ++) {
	            String res = "";
	            for(int j = i; j < len1; j ++) {
	                res += s1.charAt(j);
//	                 System.out.println("Step " + i + res);
	            }
	            for(int k = 0; k < i; k ++) {
	               res += s1.charAt(k); 
	                // System.out.println("Step " + i + res);
	            }
	            if(res.equals(t)) {
	                return true;
	            }
	        }
	        return false;
	    }
}
