package GeeksForGeeksProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwoLengthSameCheckSameOrNot {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int size = Integer.parseInt(scn.next());
		long [] A = new long[size];
		inputArray(A);
		long [] B = new long[size];
		inputArray(B);
		boolean b = checkArraySameOrNot(A, B, size);
		if(b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static boolean checkArraySameOrNot(long [] A, long [] B, int N) {
		Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < N; i ++) {
             if(A[i] != B[i]) {
                    return false;
                }
        }
        return true;
	}
	 public static void inputArray(long [] arr) {
	        for(int i = 0; i < arr.length; i ++) {
	            arr[i] = scn.nextInt();
	        }
	    }
}
