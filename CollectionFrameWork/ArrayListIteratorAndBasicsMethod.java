package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIteratorAndBasicsMethod {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
//		**************** taking input by user
		ArrayList <Integer> al = new ArrayList <> ();
		System.out.println("Array list element by user : ");
		for(int i = 0; i < 5; i ++) {
			Integer val = scn.nextInt();
			al.add(val);
		}
		
		System.out.println("Array List by user is : " + al);
		
		
		ArrayList <String> list = new ArrayList <> ();
		list.add("Same");
		list.add("khan");
		list.add("Sam");
		list.add("kha");
		list.add("Sameer");
		list.add("Ali");
//		printing list
//		***********************
//		System.out.print(list + " ");
		
//		************ find the size of list
		System.out.println("Size is : " + list.size());

//		******************************* printing element
		// traversal on list and print 		 by for each loop
		
//		for(String e : list) {
//			System.out.println(e + " ");
//		}
		
//		******************* iterator
////		traversal list by iterator
//		Iterator itr = list.iterator();//getting the Iterator  
//		while(itr.hasNext()) {//check if iterator has the elements  
//			System.out.println(itr.next());//printing the element and move to next  
//		}
		
		
//		************* get and set
//		set() -- > changes or update the element
		
		list.set(3, "Ansari");
//		traveral on list
		for(String e : list) {
			System.out.print(e + " ");
		}
		
		System.out.println();
//		get() --> it return the element who passing index
		
		System.out.println("Returning element : " + list.get(3));
		
		
//		############## sort the arrayl list
		Collections.sort(list);
		System.out.println("After Sorting : ");
//		method --- 1
//		for(String e : list) { 
//			System.out.print(e + " "); 
//		}
		
//		method -- 2
//		or we can use lambda expression *************
//		list.forEach(e -> {
//			System.out.print(e + " ");
//		});
		
//		method -- 3
//		or by simple for loop
		for(int i = 0; i < list.size(); i ++) {
			System.out.print(list.get(i) + " ");
			
			System.out.println();
			System.out.println();
			
//			********************************* add elements and addAll and add a specic position any element
			System.out.println("After Basic addAll and specific posidtion etc.. ");
			 ArrayList<String> l=new ArrayList<String>();  
			System.out.println("Initial list of Elements " + l);
			 //Adding elements to the end of the list  
			l.add("Ravi");  
	        l.add("Vijay");  
	        l.add("Ajay");  
	        System.out.println("After invoking add(E e) method: "+ l);  
	        //Adding an element at the specific position  
	         l.add(1, "Gaurav");  
	        System.out.println("After invoking add(int index, E element) method: "+ l);  

	        ArrayList<String> l1=new ArrayList<String>();  
	          l1.add("Sonoo");  
	          l1.add("Hanumat");  
	          //Adding second list elements to the first list  
	           l.addAll(l1);  
	           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ l);
//	           taking 3rd list
	           ArrayList<String> l2=new ArrayList<String>();  
	           l2.add("John");  
	           l2.add("Rahul");  
	           //Adding second list elements to the first list at specific position
	           l.addAll(1, l2);  
	           
	           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+l);
	           
	           
//	           **************************** Remove method
	           System.out.println();
	           System.out.println("After adding specific now remove");
	           //Removing specific element from arraylist  
	           l.remove("Rahul");
	           System.out.println("After invoking remove(object) method: "+l);
	           //Removing element on the basis of specific position  
	           l.remove(0); 
	           System.out.println("After invoking remove(index) method: "+ l);   
	           //Creating another arraylist  
	           ArrayList <String> l3=new ArrayList<String>();    
	           l3.add("Ravi");    
	           l3.add("Hanuma");    
	           //Adding new elements to arraylist  
	           l.addAll(l3);  
	           System.out.println("Updated list : "+l);   
	           //Removing all the new elements from arraylist  
	           l.removeAll(l3);  
	           System.out.println("After invoking removeAll() method: "  + l);
	           //Removing elements on the basis of specified condition  
	           l.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression
	           System.out.println("After invoking removeIf() method: "+l);
	         //Removing all the elements available in the list  
	           l2.clear();  
	           System.out.println("After invoking clear() method: "+l2);
	           
	           
//	           ********************************
	           System.out.println();
	           System.out.println("Method isEmpty() its reutn true or false");
	           System.out.println("is l2 is empty : " + l2.isEmpty());
	           System.out.println("is l is empty : " + l.isEmpty());
	           
	           
	           
	           		}
	}

}
