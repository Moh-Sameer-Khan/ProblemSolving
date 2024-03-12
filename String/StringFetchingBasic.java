package com.String;

public class StringFetchingBasic {
	public static void main(String[] args) {
		String str = "Hello World!";
//		Fetching in String
		System.out.println(str.charAt(4)); // o
//		System.out.println(str.charAt(-1));  // error  stringindexOutOfBounds
		
//		String Immutable but point other string
		String s1 = "Hell";
		s1 = "hi";
		System.out.println(s1); // hi but only point not first string change
		
//		String Length
		String s2 = "sameer";
		for(int i = 0; i < s2.length(); i ++) {
			System.out.println(s2.charAt(i));
		}
	
	
//	How many string will be Generate
		String name1 = "same"; //1
		String name2 = "khan";//2
		name1 = name1 + name2;//3
		System.out.println(name1);
//		above will be 3 string generate
	}
}
