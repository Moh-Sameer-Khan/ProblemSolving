package com.String;

import java.util.Scanner;

public class PrintintegerToWord {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number String");
		String [] arr = {"zero", "One", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		System.out.println(arr.length);
		int s = scn.nextInt();
		printWord(s, arr);
	}
	public static void printWord(int s, String [] arr) {
		int n = reverseNumber(s);
		while(n > 0) {
			int digit = n % 10;
					System.out.print(arr[digit] + " ");
					n = n / 10;
		}
	}
	public static int reverseNumber(int n) {
		int previousNum = 0;
		while(n != 0) {
			int digit = n % 10;
			n = n / 10;
			previousNum = digit + previousNum * 10;
		}
//		System.out.println(previousNum);
		return previousNum;
	}
}
