package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class FreqMapFindMaximumFreqCharcter {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter a String : ");
        String str = scn.next();
        printMaxFreqOfChar(str);
    }
    public static void printMaxFreqOfChar(String s) {
        int [] fmap = createFreqMap(s);
//        imagine max is at 0 index in freq map
        int max = fmap[0];
//        imagine character is s index in string
        char ansCh = s.charAt(0);
//        bcz we are getting maximum from string so
        for (int i = 0; i < s.length() ; i ++) {
            char ch = s.charAt(i);
            if(fmap[ch - 'a'] > max) {
                max = fmap[ch - 'a'];
//                if our max will be change then our character also change
                ansCh = ch;
            }
        }
        System.out.println(ansCh);
    }
    public static int [] createFreqMap(String s) {
        int size = 'z' - 'a' + 1;
        int [] fmap = new int [size];
        for(int i = 0; i < s.length(); i ++) {
            char ch = s.charAt(i);
            int sv = ch - 'a';
            fmap[sv] ++;
        }
        return fmap;
    }
}
