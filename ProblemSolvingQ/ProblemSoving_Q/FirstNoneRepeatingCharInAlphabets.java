package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class FirstNoneRepeatingCharInAlphabets {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String str = scn.nextLine();
        firstNonRepeatingCharcter(str);
    }
    public static void firstNonRepeatingCharcter(String s) {
        int len = s.length();
//         create freq map
        int [] fmap = createFreqMap(s);
        for(int i = 0; i < len; i ++) {
            char ch = s.charAt(i);
            if(fmap[ch - 'A'] == 1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println(-1);
    }
    public static int [] createFreqMap(String s) {
        int size = 'z' - 'A' + 1; // bcz small and capital both latter in string
        int [] fmap = new int [size];
        for(int i = 0; i < s.length(); i ++) {
            char ch = s.charAt(i);
            int sv = ch - 'A';
            fmap[sv] ++;
        }
        return fmap;
    }

}
