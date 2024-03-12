package com.String;

public class ReverseWordsBySplitInbuiltMethod {

	public static void main(String[] args) {
		String str = "Hi How are You Bro";
//		print the string words using split
		reverseWordsPrint(str);
	}
	public static void reverseWordsPrint(String s) {
		String [] arr = s.split(" "); // here we can pass anyting *,#,or(,) anything which you want to split
		for(int i = arr.length - 1; i >= 0; i --) {
			System.out.print(arr[i] + " ");
		}
	}
}
