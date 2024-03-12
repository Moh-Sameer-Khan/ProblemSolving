package com.String;

public class StringBasicArray {
	public static void main(String[] args) {
//		String str = "geek";
////		System.out.println(str.length()); //
////		System.out.println(str.charAt(3)); // k
////		str.charAt(0) = 'p' ; // not change bcz string is immutable and charAt() is a function
////		str = "Peek"; // now string point this but first string will not be change only str point this Ex - Owner name -- HOme and new Home 
//		for(int i = 0; i < str.length(); i ++) {
//			System.out.print(str.charAt(i) + " ");
//		}
		
//		//
//		char ch = 'a';
//		char ch = "a"; // error conversion
		
//		String str1 = "a";
//		String str2 = 'a'; // error conversion but after concatenation we can make string like
//		String s = 'a' + "";
////		String s1 = 1 + ""; // now valid
//		System.out.println(s);
		
		
		/// time complexity
		String fName = "Sameer"; // 
		String lName = "Khan";
		int m = fName.length();
		int n = lName.length();
		System.out.print("Full Name : ");
		for(int i = 0; i < m; i ++) { // O(m)
			System.out.print(fName.charAt(i));
		}
		System.out.print(" ");
		for(int i = 0; i < n; i ++) { // O(n)
			System.out.print(lName.charAt(i));
		}
		/// if we use 
//		String fullName = fName + " " + lName; // tc = O(m + n) and sc = O(m + n)
	}
}
