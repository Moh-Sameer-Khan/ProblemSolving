package com.CollectionFrameWork;

import java.util.HashMap;

public class HashMapBasics {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		    //   insertin
		System.out.println("Inserting the key values in hashMap : ");
		hm.put("Delhi", 12);
		hm.put("UP", 23);
		hm.put("PB", 22);
		System.out.println(hm);
		// update the value
		System.out.println("Updating the value : ");
		hm.put("PB", 92);
		System.out.println(hm);
		        
		// get the value
		System.out.println("Getting the value : ");
		int val = hm.get("Delhi");
		System.out.println(val);
		
		// size
		System.out.println("Size of HashMap : ");
		System.out.println(hm.size());
		        
		// searching
		System.out.println("Searching or finding key in the Hash Map  : ");
		System.out.println(hm.containsKey("Delhi")); // true
		System.out.println(hm.containsKey("lhi")); // false
		        
		// Iteration loop
		System.out.println("Iteration here : ");
		for(String ele : hm.keySet()) {
		    // System.out.println(ele);
		    System.out.println(ele + " -> " + hm.get(ele));
		}
		
//		remove key
		hm.remove("Delhi");
		System.out.println("After Remvoe Key : " + hm);
	}

}
