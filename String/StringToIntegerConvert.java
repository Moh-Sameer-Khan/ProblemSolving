package com.String;

public class StringToIntegerConvert {
	public static void main(String[] args) {
//		String n = "1234";
//		n = n + 4;
//		System.out.println(n); // 12344 // bcz string
//		
//		String to integer by inbuilt method
		String n = "1234"; // its can be convert bcz integer
//		String n = "123 4"; // we cannot convert this to integer bcz its have space
//		String n = "abcd"; // we cannot convert this to integer bcz its have alphabets
		int n1 = Integer.parseInt(n);
		n1 += 4;
		System.out.println(n1); // 1238 // bcz now integer value
		
		
		///// String to integer by method own method
		
//		String str = "8579";
//		String str = "-8579";  // in user define method - or -- are not allowed but inbuilt allowed only single -
//		solved - minus problem ignore first digit like - then in end add -  see below
		String str = "-8579";
		int num = parseInt(str);
		num += 10;
		System.out.println("After user define method number is : " + num);;
	}
	
////	to parse string to integer
	
//	public static int parseInt(String s) {
//		int ans = 0;
//		for(int i = 0; i < s.length(); i ++) { // its take "8579" 
//			int digit = s.charAt(i) - '0'; // --> '8' --'5'--'7'---'9'  == - '0' or 48
//			ans = ans * 10 + digit;
//		}
//		return ans;
//	}
		
	/// for minus problem solved
	
	public static int parseInt(String s) {
		int ans = 0;
		boolean neg = false;
		int i = 0;
		if(s.charAt(i) == '-') { // here we ignore index 0
			neg = true;
			i ++;
		} // start from 1 now
//		for(i = 1; i < s.length(); i ++) { // its take "8579" 
//		or
		for(; i < s.length(); i ++) {
			int digit = s.charAt(i) - '0'; // --> '8' --'5'--'7'---'9'  == - '0' or 48
			ans = ans * 10 + digit;
		}
//		for - minus symbol again come in output so use
		if(neg == true) {
			ans = -ans;
		}
//		now will be perfect output
		return ans;
	}
}
