 package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

//import java.io.*;
import java.util.*;
//import java.util.Arrays;
public class  AddValueCalculator {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter size and take input : ");
        int size = Integer.parseInt(scn.next());
        int [] arr = new int[size];
        takeInputArrayVal(arr);
        int value = scn.nextInt();
        int[] rArr = addValue(arr,value);
        printArr(rArr);
    }
    public static int[] addValue(int[] arr, int value) {
//    	By mukket
    	
//        if(arr.length == 1 && (arr[0] + value)  > 9){
//            int [] ans = new int [2];
//            ans[0] = 1;
//            ans[1] = (arr[0] + value) % 10;
//            return ans;
//        }
//        int len = arr.length;
//        if(isAllNine(arr)) {
//            int [] ans = new int[len + 1];
//            ans[0] = 1;
//            int carry = 0;
//        for(int i = len - 1; i >= 0; i --) {
//            int sum = 0;
//            sum = (value + carry + arr[i]);
//            ans[i + 1] = (sum % 10);
//            carry = (sum / 10);
//            value = 0;
//        }
//        return ans;
//        }else{
//            int [] ans = new int[len];
//            int carry = 0;
//        for(int i = len - 1; i >= 0; i --) {
    	
//            int sum = 0;
//            sum += (value + carry + arr[i]);
//            ans[i] = (sum % 10);
//            carry = (sum / 10);
//            value = 0;
//        }
//        return ans;
    	
    	
//    	By Me
    	
    	int n = arr.length;
        // for lenght 1 
        // System.out.println(value);
        if(n == 1 && (arr[0] + value) > 9) {
            // System.out.println(arr[0] + value);
            int ans [] = new int [2];
            ans[0] = 1;
            ans[1] = (arr[0] + value) % 10;
            System.out.println(ans[1]);
            return ans;
        }
        // if all element is nine
        boolean b = checkAllNine(arr);
        if(b) {
            int [] ans = new int [n + 1];
            ans[0] = 1;
            int carry = 0;
            for(int i = n - 1; i >= 0; i --) {
                int sum = 0;
                sum = value + carry + arr[i];
                ans[i + 1] = sum % 10;
                carry = sum / 10;
                value = 0;
            }
            return ans;
        }
        // if not all element nine then
        // int sum = 0;
        int [] ans = new int [n];
        int carry = 0;
        for(int i = n - 1; i >= 0; i --) {
            int sum = 0;
            sum = value + carry + arr[i];
            ans[i] = sum % 10;
            carry = sum / 10; 
            value = 0;
        }
        return ans;
        
    }
    public static boolean checkAllNine(int [] arr){
        for(int i : arr) {
            if(i != 9) return false;
        }
        return true;
    }
    public static void takeInputArrayVal(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
    public static void printArr(int [] arr) {
        for(int e : arr) {
            System.out.print(e + " ");
        }
    }
}