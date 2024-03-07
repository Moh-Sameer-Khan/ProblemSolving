package com.FS10_HackerRank.ProblemSovingQ;

import java.util.Scanner;

public class ConsecutiveOnlyOneInString {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter string 0 and 1..");
        String str = scn.next();
        int ans = countConsecutiveOne(str);
        System.out.println(ans);
	}
    public static int countConsecutiveOne(String s) {
    
     int maxCount = 0;
     int count = 0;
     for(int i = 0; i < s.length(); i ++) {
         char currCh = s.charAt(i);
//         bcz question given only 1 max consecutive count so equal '1'
         if(currCh == '1') {
//              if same as previous one character then increase the count
             count ++;
         }else {
//              else restart the count
             count = 0;
         }
         maxCount = Math.max(maxCount, count);
     }
     return maxCount;
    }
}

//Question
//Sample Input 0
//
//0110111011211111
//Sample Output 0
//
//5
