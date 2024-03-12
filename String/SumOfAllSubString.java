package com.String;

public class SumOfAllSubString {
	public static void main(String[] args) {
		// tc --> O(n^3) and sc --> O(1)
		String str = "12345";
		int ans = findSumSubString(str);
		System.out.println("Total Sum of all String is : "  + ans);
	}
	public static int findSumSubString(String s) {
		int sum = 0;
		int len = s.length();
		/// Same like Substring find first substring after that add all
		for(int st = 0; st < len; st ++) { // O(n)
			for(int end = st + 1; end <= len; end ++) { // O(n)
				String ans = s.substring(st, end); // O(n)
//				int res = Integer.parseInt(ans); // O(n) // by using by inbuilt function but we will by own method
				
//				by own method 
				int res = parseInt(ans); // its give a integer number
				sum = sum + res;
			}
		}
//		return res;// for inbuilt method 17 line
		return sum;
	}
//	method for String to Integer 
	public static int parseInt(String s) {
		int len = s.length();
		int ans = 0;
		for(int i = 0; i < len; i ++) {
			int ascii = s.charAt(i);
			int digit = ascii - '0'; // bcz shifted value = actual value - start
			ans = ans * 10 + digit; // next = previous * 10 + digit;
		}
		return ans;
	}
}
