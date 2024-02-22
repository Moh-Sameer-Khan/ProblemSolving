package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class PrintFreqInStringAlphabet {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter a String : ");
       String str = scn.next();
        printFreqOfChar(str);
    }
    public static void printFreqOfChar(String s) {
//    	create freq map
        int [] fmap = createFreqMap(s);
//        bcz output depeds on string so traversal on string
        for (int i = 0; i < s.length(); i ++) {
            char ch = s.charAt(i);
            if(fmap[ch - 'a'] != 0) { // who is not 0 so print
                System.out.println(ch + "-" + fmap[ch - 'a']);
//                after print one character do that character 0 bcz that character can again come in string so
                fmap[ch - 'a'] = 0;
            }
        }
        
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
