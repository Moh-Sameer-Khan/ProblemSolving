package com.CollectionFrameWork;
import java.util.Stack;
public class StackBasicEmptyConcept {

	public static void main(String[] args) {
		Stack  <Integer> stk = new Stack<>();
//		empty operation // checking empty or not
		boolean res = stk.empty();
		System.out.println("is the stack empty ?  --> " + res); // true
//		push operation  // push elements in the stack
		stk.push(4);
		stk.push(6);
		stk.push(-2);
		stk.push(8);
		stk.push(10);
//		print elements of the stack is  ####################
		System.out.println("Elements of the Stacks is : " + stk);
//		again check stack is empty or not
		res = stk.empty();
		System.out.println("is Stack Empty ? -- > " + res); // false
		
//		################ size of Stack #########
		
		System.out.println("Size of stack is : " + stk.size());
		
//		print the stack element
		System.out.println("Stack Element is : " + stk);
		
//		we are finding peek element in this stack ################
//		int ans = stk.peek();
//		System.out.print("Stack Element is : " + ans);  /// or 
		System.out.println("Stack Peek Element is : " + stk.peek());
		
//		searching method #########################
//		its take the exist value who is in stack return that value index
//		int search = stk.search(-2); // 3
//		int search = stk.search(4); /// 5
		int search = stk.search(10);
		System.out.println("Search Index is : " + search);
		
		
		
		
//		printing all element by loop  #######################
		
//		1. ForEach() method  **********
		System.out.println("Printing element by for each Loop : ");
		stk.forEach(n -> {
			System.out.print(n + " ");
		});	
	}

}
