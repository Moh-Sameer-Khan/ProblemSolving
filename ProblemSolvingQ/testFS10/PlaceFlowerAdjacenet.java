package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.Scanner;

public class PlaceFlowerAdjacenet {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size, values and flower no");
		int n = scn.nextInt();
        int [] arr = new int [n];
        inputArr(arr);
//        no of flower
        int k = scn.nextInt();
        boolean ans = place(arr,k);
        System.out.print(ans);
	}

public static boolean place(int [] a, int k) {
        
        if(k == 0)
            return true;
        int i;
        for(i = 0;i < a.length; i ++)
        {
            if(a[i] == 0 && (i == 0 || a[i-1] == 0) && (i == a.length-1 || a[i+1] == 0))
            {
                k --;
                if(k == 0)
                    return true;
                a[i]=1;
            }
        }    
        return false;
    }
    public static void inputArr(int [] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scn.nextInt();
        }
    }
}


//Question -->
//
//Output Format
//
//print true or false.
//
//Sample Input 0
//
//5
//1 0 0 0 1
//1
//Sample Output 0
//
//true
