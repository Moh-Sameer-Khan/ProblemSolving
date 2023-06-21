package com.GeeksForGeeksProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersAnArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < n; i ++) {
			arr[i] = scn.nextInt();
		}
		ArrayList<Integer> ans = printLeadersArray(arr, n);
		for(int i = 0; i < ans.size(); i ++) {
			System.out.print(ans.get(i) + " ");
		}
			
	}
	public static ArrayList<Integer> printLeadersArray(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        int maxR = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i --) {
            if(maxR <= arr[i]) {
                maxR = arr[i];
                list.add(maxR);
            }
        }
        Collections.reverse(list);
        return list;
    }
}


//Quetinon --> GFG ---
//
//n = 6
//A[] = {16,17,4,3,5,2}
//Output: 17 5 2
//Explanation: The first leader is 17 
//as it is greater than all the elements
//to its right.  Similarly, the next 
//leader is 5. The right most element 
//is always a leader so it is also 
//included.