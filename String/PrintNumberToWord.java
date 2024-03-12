package com.String;

import java.util.Scanner;

public class PrintNumberToWord {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number String");
		String [] arr = {"zero", "One", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		System.out.println(arr.length);
		String s = scn.next();
		printWord(s, arr);
	}
//	Method 2 // By Array
	public static void printWord(String s, String [] arr) {
		for(int i = 0; i < s.length(); i ++) {
			int ch = s.charAt(i) - '0';
			for(int j = 0; j < arr.length; j ++) {
				if(ch == j) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
	
//	Method 1 
	
//	public static void printWord(String s) {
//		for(int i = 0; i < s.length(); i ++) {
//			int ch = s.charAt(i) - '0';
//			if(ch == 1) {
//				System.out.print("one" + " ");
//			}else if(ch == 2) {
//				System.out.print("two" + " ");
//			}else if(ch == 3) {
//				System.out.print("three" + " ");
//			}else if(ch == 4) {
//				System.out.print("four" + " ");
//			}else if(ch == 5){
//				System.out.print("five" + " ");;
//			}else if(ch == 6){
//				System.out.print("six" + " ");
//			}else if(ch == 7){
//				System.out.print("seven" + " ");
//			}else if(ch == 8){
//				System.out.print("eight" + " ");
//			}else if(ch == 9){
//				System.out.print("nine" + " ");
//			}else if(ch == 0) {
//				System.out.print("zero" + " ");
//			}
//		}
//	}
}
