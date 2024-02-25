package com.FS10_HackerRank.ProblemSovingQ;
import java.util.Scanner;

public class MirrorImageOrSum0Of2ArraysReverseNum {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
//    	array 1
    	System.out.println("Enter the size Array 1 : ");
        int size1 = Integer.parseInt(scn.next());
        int [] arrFirst = new int[size1];
//        calling method to take value of array 1
        System.out.println("Enter the size Array 1 Values : ");
        takeInputArray1Val(arrFirst, size1);
//        array 2
        System.out.println("Enter the size Array 2 : ");
        int size2 = Integer.parseInt(scn.next());
        int [] arrSecond = new int[size2];
        System.out.println("Enter the size Array 2 Values : ");
//        calling method to take value of array 2
        takeInputArray2Val(arrSecond, size2);
//        calling find 
        findMatchingSumZero(arrFirst, arrSecond, size1, size2);
    }
//    taking input method array 1
    public static void takeInputArray1Val(int[] arrFirst, int size1) {
        for(int i = 0; i < size1; i ++) {
            arrFirst[i] = scn.nextInt();
        }
    }
//    taking input method array 2
    public static void takeInputArray2Val(int[] arrSecond, int size2) {
        for(int i = 0; i < size2; i ++) {
            arrSecond[i] = scn.nextInt();
        }
    }
//    find result zero sum in two arrays
    public static void findMatchingSumZero(int[] arrFirst, int [] arrSecond, int size1, int size2) {
        for(int i = 0; i < size1; i ++) { 
            for(int j = 0; j < size2; j ++) {
                if((arrFirst[i] + arrSecond[j]) == 0) {
                    System.out.print(i + " ") ;
                }
            }
        }
    }
}