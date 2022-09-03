package Arrays;

import java.util.Arrays;

public class CheckIfTwoArraysEqualOrNot {

	/** =, +, _, -
	 * Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not.
	 * Two arrays are said to be equal if both of them contain same set of elements, arrangements of elements
	 * may be different though.
	 * Note: If there are repetitions, then counts of repeated elements must also be the same for the arrays to be equal.
	 * 
	 * Input: 
	 * N=5
	 * A[]={1,2,5,4,0}
	 * B[]={2,4,5,0,1}
	 * Output: 1
	 * Explanation: Both the array can be rearranged to {0,1,2,4,5}
	 */
	public static void main(String[] args) {
		int[] A = {1,2,5,4,0};
		int[] B = {2,4,5,0,1};
		System.out.println("Unsorted Array: "+ Arrays.toString(A));
		System.out.println("Sorted Array: "+ Arrays.toString(sort(A)));
		A=sort(A);
		B=sort(B);
		System.out.println("Check if arrays are same or not: "+ checkEquality(A, B));
	}
	
	//Selection sort
	public static int[] sort(int[] Arr) {
		int size = Arr.length;
		int index=0;
		int subIndex=0;
		int temp;
		int var;
		boolean flag;
		
		for(int i=0; i<size; i++) {
			var=Arr[i];
			index=i;
			flag=false;
				for(int j=i+1; j<size; j++) {
					if(var>Arr[j]) {
						var=Arr[j];
						subIndex=j;
						flag=true;
					}
				}
				if(flag) {
					temp=Arr[index];
					Arr[index]=Arr[subIndex];
					Arr[subIndex]=temp; 	
				}
		}
		return Arr;
	}
	
	public static int checkEquality(int[] A, int[] B) {
		if(A.length==B.length) {
			for(int i=0; i<A.length; i++) {
				if(A[i]!=B[i]) {
					return 0;
				}
			}
		} 
		else {
			return 0;
		}
		return 1;
	}

}
