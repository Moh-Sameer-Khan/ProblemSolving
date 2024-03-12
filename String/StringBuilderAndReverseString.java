package com.String;

import java.util.Scanner;

public class StringBuilderAndReverseString {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder(); // ouput but only show space
//		System.out.println(sb);
		
//		String s = new String("Hi"); // in string
//		s = s + 'a'; // O(n) but in String builder take O(1)
//		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Hello");
//		in String Builder add string by append  method in last
		sb.append("A"); // O(1) -- that the advantage of StringBuilder  and we can change the String in String builder By str.setCharAt(index,ch)
		sb.setCharAt(2, 'k');
		System.out.println(sb);
		scn.close();
//		String ansStr = reverseString(str);
//		System.out.println("Reverse String is : " + ansStr);
	}
	
	// see reverse in reverse
}
