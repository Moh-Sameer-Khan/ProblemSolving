package com.String;

public class CopyString {

	// tell time and space complexity
	public static void main(String[] args) {
		String str = "sameer";
		String copy = "";
		for(int i = 0; i < str.length(); i ++) { // O(n)
			copy = copy + str.charAt(i); // O(n)
		}
		System.out.println(copy.length());
//		// Total complexity is --> tc = O(n^2) and sc = O(n)
	}

}
