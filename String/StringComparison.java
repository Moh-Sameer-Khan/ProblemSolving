package com.String;
// Which String is Greater Print
public class StringComparison {
	public static void main(String[] args) {
		String a1 = new String("hello");
		String a2 = new String("hello");
//		System.out.println(a1 == a2); // false bcz compare from address and normal heap address different
		
		// equals() -- check the complete internal data
		boolean b = a1.equals(a2); //use this built function or we can use by for loop and charAt(i) 
		System.out.println(b);
		
		
//		String a1 = "hello";
//		String a2 = "hello";
//		System.out.println(a1 == a2); // true bcz store in interpool
		
		String s1 = new String("aeroplane");
//		String s1 = new String("Apple");
//		String s1 = new String("apple");
		String s2 = new String("Apple");
		int d = s1.compareTo(s2); // check from ASCII value one by one
		if(d < 0) {
			System.out.println("s1 < s2");
		}else if(d > 0) {
			System.out.println("s1 > s2");
		}else {
			System.out.println("Both are same");
		}
	}
}
