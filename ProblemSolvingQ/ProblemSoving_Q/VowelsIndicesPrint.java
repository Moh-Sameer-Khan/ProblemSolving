package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class VowelsIndicesPrint {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter a String : ");
        String str = scn.nextLine();
        printIndicesVowels(str);
    }
    public static void printIndicesVowels(String s) {
        for(int i = 0; i < s.length(); i ++) {
            char ch = s.charAt(i);
            boolean b = isVowel(ch);
            if(b) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            return true;
        }else {
            return false;
        }
    }
}

//Question
//Sample Input 0
//
//aqua
//Sample Output 0
//
//0 2 3
