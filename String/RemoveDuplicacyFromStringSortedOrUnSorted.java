package com.String;

//import java.util.Arrays;
 
public class RemoveDuplicacyFromStringSortedOrUnSorted {
	public static void main(String[] args) {
		String str = "aasdfkkfskkdjjdjsjsjsjjsssssskkkkkklllll";
		String ans = removeDulicacy(str);
		System.out.println("After removing Duplicacy String is : \n " + ans);
	}
	public static String removeDulicacy(String s) {
		StringBuilder sb = new StringBuilder(); // using SB bcz output size will be unfixed and append
		int size = 'z' - 'a' + 1;
		boolean [] uCh = new boolean [size];
		for(int i = 0; i < s.length(); i ++) {
			char ch = s.charAt(i);
			int index = ch - 'a';  // shifted value = actual value - start; 
			if(uCh[index] == false) {
				sb.append(ch);
				uCh[index] = true;
			}
		}
		String ans = String.valueOf(sb);
		return ans; // till here our string remove duplicacy if we want our output come in the form of sorting then use down process and then change return this off 
		
//		// for output also will in sorting form so if not asking then not need this down code
//		char [] chArr = crateChArray(ans);
//		Arrays.sort(chArr);
//		String res = chArrayToString(chArr);
//		return res;
	}
//	for string to character array
//	public static char[] crateChArray(String s) {
//		char [] chArr = new char [s.length()];
//		for(int i = 0; i < s.length(); i ++) {
//			chArr[i] = s.charAt(i);
//		}
//		return chArr;
//	}
//	
////	for character array to  string
//	public static String chArrayToString(char [] chArr) {
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i < chArr.length; i ++) {
//			sb.append(chArr[i]);
//		}
//		String ans = String.valueOf(sb);
//		return ans;
//	}
}
