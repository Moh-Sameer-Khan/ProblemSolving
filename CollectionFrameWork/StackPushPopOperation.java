package com.CollectionFrameWork;

import java.util.Stack;

public class StackPushPopOperation {

	public static void main(String[] args) {
		//creating an object of Stack class  
		Stack <Integer> stk = new Stack<> ();
		System.out.println("Stack is : " + stk); // empty // []
//		pushing elements into the stack
		pushElement(stk, 20);
		pushElement(stk, 13);
		pushElement(stk, 89);
		pushElement(stk, 90);
		pushElement(stk, 11);
		pushElement(stk, 23);
		pushElement(stk, 35);
		pushElement(stk, 19);
		
//		popping element from stack
		popElement(stk);
		popElement(stk);
	}
//	method for pushing elemnt in the stack
	@SuppressWarnings("removal") // bcz error coming so
	public static void pushElement(Stack<Integer> stk, int idx) {
//		invoking push() method
		stk.push(new Integer(idx));
		System.out.println("push --> " + idx);
//		prints modified stack
		System.out.println("After Stack is : " + stk);
	}

//	method for popping element from the stack is 
	public static void popElement(Stack stk) {
		System.out.println("pop --> ");
//		invoking pop() method
//		Integer k = stk.
	}
}
