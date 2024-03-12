package com.String;

public class PanagramUpperAndLowerAndAnyCharacter {

	public static void main(String[] args) {
//		String str = "abCdef123ghijklmnoPQRstuvW%$xyz"; // Panagram
		String str = "abCdef123ghijklmnoPQRstuvW%$xy"; // Not a Panagram
		boolean b = checkPanagram(str);
		if(b == true) {
			System.out.println("Panagram");
		}else {
			System.out.println("Not a Panagram");
		}
	}
	public static boolean checkPanagram(String s) {
//		creare frequency map by shifing
		int [] fmap = createFreqMap(s);
		for(int i = 0; i < fmap.length; i ++) {
			if(fmap[i] == 0) {
				return false; 
			}
		}
		return true;
	}
	public static int [] createFreqMap(String s) {
		int size = 'z' - 'a' + 1;
		int [] fmap = new int [size];
		for(int i = 0; i < s.length(); i ++) {
			char ch = s.charAt(i); // character can be Upper or number or anything so find or convert first
			ch = convertToLower(ch);
			if(ch == '0') { // if ch is not not alphabet then skip for next character edge case
				continue;
			}
			fmap[ch - 'a'] ++;
		}
		return fmap;
	}
//	convert to lower and check if other character
	public static char convertToLower(char ch) {
		if(ch >= 'a' && ch <= 'z') {
			return ch;
		}else if(ch >= 'A' && ch <= 'Z') {
			return (char)(ch + 32);
		}else {
			return '0';
		}
	}
}
