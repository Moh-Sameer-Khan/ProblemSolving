package com.String;

public class PrintSubString {
	public static void main(String[] args) {
		String str = "same";
//		String str = "sam e";  // here space also create string
		printSubString(str);
	} 
	public static void printSubString(String s) {
		int len = s.length();
//		outer loop for start 0, 1, 2,3,..
		for(int st = 0; st < len; st ++) {
//			inner loop for from where and till where go Ex.. 1-->end, 2-->end, 3-->end
			for(int end = st + 1; end <= len; end ++) { // st + 1 --> bcz its substring method excluded for end parameter
				String ans = s.substring(st, end);
				System.out.println(ans);
//				System.out.println(st + " index is  " + end + " till where go is --> "  + ans);  /// for output clearance
			}
		}
	}
}
