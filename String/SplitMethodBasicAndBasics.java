package com.String;

public class SplitMethodBasicAndBasics {

	public static void main(String[] args) {
//		String str = "Hi How are You Bro";
		String str = "Hi How are     You Bro"; // here output will also print after one space -1-2-3-4-  ---> ouput will be 4 length for this(space) and other count string words 
//		print the string words using split
		splitStringPrint(str);
	}
	public static void splitStringPrint(String s) {
		String [] arr = s.split(" "); // here we can pass anyting *,#,or(,) anything which you want to split
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
//			System.out.println(i + " index is " + arr[i]);// only for clearance
		}
	}
}
