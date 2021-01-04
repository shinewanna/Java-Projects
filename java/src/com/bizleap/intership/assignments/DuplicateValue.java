/*
 1) Write a java method that would take an array of integers and return an array with the numbers who occurrence
in the input array is even number.

For example,
[1, 2, 3] shall return []
[1, 2, 3, 2] shall return [2]
[9, 1, 1, 5, 3, 1, 5, 1] shall return [1, 5]

2) Write the same method above but without using any array or array list.

References:

        Collection Framework
        Collections in Java
        Collection with Example
 */

package com.bizleap.intership.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValue {

	public List<Integer> findEvenNumberOfDuplicateWithArray(List<Integer> inputArray) {
		String same = "";
		List<Integer> list = new ArrayList<Integer>();

		for (int i : inputArray) {
			int count = 0;

			for (int j : inputArray)
				if (i == j)
					count++;

			if ((count - 1) % 2 != 0) {
				if (!same.contains(i + "")) {
					list.add(i);
					same += i + "";
				}
			}
		}
		return list;
	}

	public Set<Integer> findEvenNumberOfDuplicateValueWithSet(List<Integer> inputArray) {
		Set<Integer> resultSet = new HashSet<Integer>(inputArray);

		for (int i : inputArray) {
			if (!resultSet.add(i))
				resultSet.remove(i);
		}
		return resultSet;
	}

	public void testDuplicate() {
		List<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(1);
		inputArray.add(2);
		inputArray.add(3);
		inputArray.add(2);
		System.out.println("Using ArrayList: " + findEvenNumberOfDuplicateWithArray(inputArray));
		System.out.println("Using Set"+findEvenNumberOfDuplicateValueWithSet(inputArray));
	}

	public static void main(String[] args) {
		new DuplicateValue().testDuplicate();
	}
}