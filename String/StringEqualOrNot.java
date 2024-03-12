package com.String;

//import java.io.*;
import java.util.*;
public class StringEqualOrNot {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        boolean ans = checkEqualOrNot(str1, str2); 
        if(ans) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public static boolean checkEqualOrNot(String s1, String s2) {
       if(s1.length() != s2.length()) {
           return false;
       }else {
            for(int i = 0; i < s1.length(); i ++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
       }
        return true;
    }
}  
