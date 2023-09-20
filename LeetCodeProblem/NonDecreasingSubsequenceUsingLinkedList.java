//package com.LeetCodeProblem.POTD;
// we will work on this later ........................??????
//import java.util.Scanner;
//
//public class NonDecreasingSubsequenceUsingLinkedList {
//	public static Scanner scn = new Scanner(System.in);
//	public static void main(String[] args) {
//		 int size = Integer.parseInt(scn.next());
//	        int [] arr = new int [size];
//	        inputArray(arr);
//	      int List<List<Integer>> =  findSubsequences(arr);
//	}
//	 public static  List<List<Integer>> findSubsequences(int[] nums) {
//	       List<List<Integer>> res = new LinkedList<>();
//	        calculate(new LinkedList<Integer>(), 0, nums, res);
//	        return res;   
//	    }
//	    private void calculate(LinkedList<Integer> list, int index, int[] nums, List<List<Integer>> res){
//	    	if(list.size()>1){
//	    		res.add(new LinkedList<Integer>(list));
//	    	}
//	        Set<Integer> used = new HashSet<>();
//	        for(int i = index; i<nums.length; i++){
//	            if(used.contains(nums[i])) continue;
//	            if(list.size()==0 || nums[i]>=list.peekLast()){
//	                used.add(nums[i]);
//	                list.add(nums[i]); 
//	                calculate(list, i+1, nums, res);
//	                list.remove(list.size()-1);
//	            }
//	        }
//	   }
//	    
//	    public static void inputArray(int [] arr) {
//	        for(int i = 0; i < arr.length; i ++) {
//	            arr[i] = scn.nextInt();
//	        }
//	    }
//}
