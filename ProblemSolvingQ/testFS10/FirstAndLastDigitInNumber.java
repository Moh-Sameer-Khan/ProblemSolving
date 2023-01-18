package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

//import java.io.*;
import java.util.*;
//import java.util.Arrays;
public class FirstAndLastDigitInNumber {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scn.nextInt();
        printFirstLast(num);
    }
    public static void printFirstLast(int n) {
        int firstDigit = n;
        while(firstDigit >= 10)
        {
            firstDigit = firstDigit / 10;
        }    
        
        int lastDigit = n % 10;
        
        System.out.print(firstDigit + " ");
        System.out.print(lastDigit);
    }
}

///Explanation
//1234 -- input
//1 4 -- output 1 first last is 4