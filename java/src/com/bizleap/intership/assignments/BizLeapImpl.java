/*
Implement a Java method that would take an integer n and return a list with n number of strings.
You must create the list by adding a string for every number from 1 to n as follows:

    add 'Biz' if the number is divisible by 3
    add 'Leap' if the number is divisible by 5
    add 'BizLeap' if the number divisible by both 3 and 5

Below is the interface of the Java class. You must implement a Java class that conforms to this interface.
Use the naming convention in which a class name is formed by simply adding the 'Impl' to the interface name that it implements.
This interface provides a method to create a list of strings for a given integer.

public interface BizLeap {
	Each string will be added for each number from 1 to n in the manner below:
	(a) add 'Biz' if the number is divisible by 3
	(b) add 'Leap' if the number is divisible by 5
	(c) add 'BizLeap' if the number divisible by both 3 and 5
	@param n The last number in the range
	@return The list of strings.

public List generateList(int n);

This method should be used to show how to call the generateList method.
It should also run some simple test cases on the method to ensure it works properly.

public void testGenerateList();
 */
package com.bizleap.intership.assignments;

import java.util.ArrayList;
import java.util.List;

public class BizLeapImpl implements BizLeap{
	
	public List<String> generateList(int n) {
		List<String> list=new ArrayList<String>();
		for(int i=1;i<=n;i++){
			if(i%3==0&&i%5==0)
				list.add("BizLeap");
			else if(i%3==0)
				list.add("Biz");
			else if(i%5==0)
				list.add("Leap");
		}
		return list;
	}
	
	@Override
	public void testGenerateList(int n) {
		System.out.println(generateList(n));
	}
	
	public static void main(String[] args) {
		BizLeap bizLeap = new BizLeapImpl();
		bizLeap.testGenerateList(30);
	}
}