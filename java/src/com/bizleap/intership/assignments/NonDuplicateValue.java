/*
 * Implement a method that takes an array of ints as input and returns the number that is not in the list twice.
Assume that the array contains only positive ints and that only one number will not have a matching pair.
Return the one number which doesn’t have a match. If it fails to find a single number, then -1 is returned.
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

public class NonDuplicateValue {

	public int getNonDuplicateInt(int[] list) {
		int result=0;
		int resultCount=0;
		
		for(int i=0;i<list.length;i++){
			int count=0;
			for(int j=0;j<list.length;j++){
				if(list[i] == list[j])
					count++;
			}
			if(count <= 1){
				result = list[i];
				resultCount++;
			}	
		}
		
		if(resultCount == 1)
			return result;
		return -1;
	}

	public void testGetNonDuplicateInt() {
		System.out.println(getNonDuplicateInt(new int[] {1,2,1,2}));
		System.out.println(getNonDuplicateInt(new int[] {9,2,2,4,4}));
	}

	public static void main(String[] args) {
		new NonDuplicateValue().testGetNonDuplicateInt();
	}
}