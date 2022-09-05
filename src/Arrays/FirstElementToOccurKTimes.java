/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

	/**
	 * @author subhajit
	 * =, +, _, 
	 * Given an array of N integers. Find the first element that occurs at least K number of times.
	 *  N=7, K=2
	 *  A[]= { 1,7,4,3,4,8,7 } 
	 *  Output: 4
	 *  Explanation: Both 7 and 4 occur 2 times
	 *  but 4 is first that occurs 2 times
	 *  As at index=4, 4 has occurred atleast 2 times whereas at index=6, 7 has occurred atleast 2 times..
	 */
public class FirstElementToOccurKTimes {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		int[] A = {8,1,7,4,8,3,4,8,7};
		
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]==A[j]) {
					list.add(j);
				}
			}
		}
		Collections.sort(list);
		System.out.println("Find the first element that occurs at least 2 times: "+A[list.get(0)]);
	}

}
