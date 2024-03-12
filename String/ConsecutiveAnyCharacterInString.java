package com.String;

import java.util.Scanner;

public class ConsecutiveAnyCharacterInString {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter string ..find Max consecurive ..");
        String str = scn.next();
        int ans = countConsecutiveMax(str);
        System.out.println(ans);
	}
    public static int countConsecutiveMax(String s) {
//    Method 1 
        
        // int ans = 0;
        // int count = 0;
        // int j = 0;
        // for(int i = 1; i < s.length(); i ++) {
        //     if(s.charAt(j) != s.charAt(i)) {
        //         ans = Math.max(ans, count);
        //         count = 1;
        //         j ++;
        //     }else {
        //         count ++;
        //         j ++;
        //     }
        // }
        // ans = Math.max(count, ans);
        // return ans;
        
        
//         // Method 2
        
       /// if in Question say 0 will not be count then use it
    	
        // if(s.charAt(0) == '0') {
        //     return 0;
        // }
    	
        char prevCh = ' ';
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i ++) {
            char currCh = s.charAt(i);
            
            if(currCh == prevCh) {
//                 if same as previous one character then increase the count
                count ++;
            }else {
//                 else restart the count
                count = 1;
                prevCh = currCh;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
