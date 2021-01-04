/*
 * Implement a method that takes an array of ints as input and returns the number that is not in the list twice.
Assume that the array contains only positive ints and that only one number will not have a matching pair.
Return the one number which doesn�t have a match. If it fails to find a single number, then -1 is returned.
Write a method to run some simple test cases on the method to ensure it works properly.
 *@param list The array of number pairs to check
 *@return The one int that doesn't have a matching pair or -1


public int getNonDuplicateInt(int list){
// Implement code
}


 *This method should be used to show how to call the getNonDuplicateInt method.
 *It should also run some simple test cases on the method to ensure it works properly.

public void testGetNonDuplicateInt();
 */

package com.bizleap.intership.assignments;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String s = "A3";
		
		for(int i=0;i<s.length();i++) {
			int bit = s.charAt(i);
			String binary = Integer.toBinaryString(bit);
			System.out.println(binary);
			for(int j=0;j<binary.length()-2;j=j+2) {
				String opr = binary.substring(j, j+2);
				System.out.println(opr);
			}
		}
		
		
//		int A[]=new int[s2.length()];
//		int psStartNumber=1;
//		int c=0;
//		for(int i=psStartNumber;i<=1000000000;i++)
//		{
//			if(c==s2.length())break;
//			int number=i;
//			
//			int sqrt=(int)Math.sqrt(number);
//			if(sqrt*sqrt==number)
//			{
//			
//				A[c]=number;
//				c++;
//				System.out.print(number+" ");
//			}
//		}
	}
}