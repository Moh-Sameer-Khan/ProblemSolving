package com.FS10_HackerRank.ProblemSolvingQ.testFS10;

import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumZero {
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array,  enter Array Values");
		int n = scn.nextInt();
        int [] arr =new int[n];
       inputArray(arr);
       int ans = findSumZero(arr, n);
       System.out.println("Total SubArray whose sum 0 is : " + ans);
	}

    //Function to count subarrays with sum equal to 0.
public static int findSumZero(int [] arr ,int n) 
{
     int sum=0, counter=0; 
     //using Hashmap to store the prefix sum which has appeared already.
     HashMap<Integer , Integer >mp=new HashMap<>();
    
        //iterating over the array.
        for(int i=0;i<n;i++)
        {
            //storing prefix sum.
            sum+=arr[i];
            
            //if prefix sum is zero that means we get a subarray with sum=0.
            if(sum==0)
            {
                //incrementing the counter.
                counter++;
            }
            
            //if prefix sum is already present in Hashmap then it is repeated 
            //which means there is a subarray whose summation is 0.
            if(mp.containsKey(sum)) 
            {
               //we add the value at prefix sum in Hashmap to counter.
               counter+=mp.get(sum);
            }
            
            //incrementing the count of prefix sum obtained in Hashmap.
            if(mp.containsKey(sum))
            {
                int k=mp.get(sum);
                k++;
                mp.put(sum,k);
                
            }
            else
             mp.put(sum,1);
        }
       
       //returning the counter.
       return counter ;
}
	public static void inputArray(int [] arr) {
		 for(int i = 0; i < arr.length;  i ++) {
	            arr[i] = scn.nextInt();
	        } 
	}
}
