package com.CollectionFrameWork;

import java.util.Scanner;
import java.util.Stack;

public class ValidOrBalancedParrenethesis {
	
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of character array and then take inputs : ");
//		taking size of array from user
		int size = Integer.parseInt(scn.next());
//		initialize an character array
		char [] arr = new char [size];
//		taking inputs from user
		inputArray(arr);
//		calling method given array is valid or not
		boolean ans = isValidParanthesis(arr);
		if(ans) {
			System.out.println("Is given character array is  Valid / Balanced : " + ans);
		}else {
			System.out.println("Is given character array is  Valid / Balanced : " + ans);
		}
	}
	public static boolean isValidParanthesis(char [] bracketArr) {
//		initialize stack type of character 
		Stack <Character> stk = new Stack <Character>();
		
//		traversal on character array
		int len = bracketArr.length;
		for (int i = 0; i < len; i ++) {
//			taking one by one character from character Array
			char ch = bracketArr[i];
			char ch1 = checkCharacter(ch);
//			check the character is opening or other other character
			if(ch1 == '0') {
//				if we found other character like 1,4, - , * , /, @, then we will continue our operation and skip these characters
				continue;
			}
			if(ch1 == '('  || ch1 == '{'  || ch1 == '[' ) {	
//				if condition true then character push in the stack 
				stk.push(ch1);
			}else { // if condition false then character pop a/o check peek element check
//				if stack is empty or first character is closing then return false 
				if(stk.empty()){ 
					return false;
				}
//				if stack have element and then check from the peek character and coming character if true then pop element form stack
				if((stk.peek() == '(' && ch1 == ')') || (stk.peek() == '{' && ch1 == '}') || (stk.peek() == '[' && ch1 == ']') ) {
//					if true then pop the top character from stack
					stk.pop();
				}else { // if coming character  is different or peek element is empty then return false
					return false;
//					or we can push in stack 
//					stk.push(ch1);
				}
			}
		}
//		now check stack after overall operation 
		System.out.println("Stack element is : " + stk);
		if(stk.isEmpty()) {
//			if stack is empty then given character array will be valid / balanced
			return true;
		}else {
//		 false stack have one or more character 
			return false;
		}
	}
//	by this method we will check charater is bracket or other character 
//	13
//	( ( 3 * 2 ) - ( 3 / 5 ) ) <--- like that type input
	public static char checkCharacter(char ch) {
		if(ch == '{' || ch == '}' || ch == '[' || ch == ']' || ch == '(' || ch == ')' ) {
			return ch;
		}else {
			return '0';
		}
	}
// taking input from user 
	public static void inputArray (char [] arr) {
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = scn.next().charAt(0);
		}
	}
}


//// Practice code -- rough code

//Stack<Character> stack = new Stack<Character>();
//if(bracket[0] == ')') return false;
//for(char ch : bracket) {
//	if(ch == '(') stack.push(ch);
//	else {
//		//if( ) return false;
//		if(stack.peek()== '('  && stack.size() < 1) stack.pop();
//		else return false;
//	}
//}
//System.out.println(stack);
//if(stack.size() > 0) return false;
//return true;

//
//
//public static char convert(char ch) {
//	if(ch == '{') return '}';
//	if(ch == '[') return ']';
//	if(ch == '(') return ')';
//	return 'a';
//}