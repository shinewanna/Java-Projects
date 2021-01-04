/*
Hashing algorithms are widely in the implementation of various data structures such as Java HashTable or HashMap as well as in the implementations of many NoSQL big data databases based on Google BigTable such as Cassandra; or in memory grid (or cache)
such as Oracle Coherence.
They all are in fact key-value stores in which the key is mapped by a hash function to integer value as an index in the list of bucks where the value should be stored or a point in the ring in case of consistent hashing.
In this exercise(Assignment 8, 9 and 10) we want to implement a liner hashing algorithm method and an utility class that uses it to implement a HashTable.

-Write a Java method that would take an input string key and return the index value from 0 to 255.
 */

package com.bizleap.intership.assignments;

public class LinearHashingAlgorithm {

	public int getHash(String key) {
		int result = 0;

		for(char ch:key.toCharArray()){
			result = (result * 31) + ch;
		}
		
		return Math.abs(result)%255;	
	}

	public static void main(String[] args) {
		String input1="AAA";
		String input2="inputs";
		String input3="Write a Java method that would take an input string key and return the index value from 0 to 255";
		String input4="LinearHashingAlgorithm";
		String input5="inputString lengthsadsad sadas assainputString lengthsadsad sadas ass inputString lengthsadsad sadas ass";
		String input6="LinearHashingAlgorithm LinearHashingAlgorithm";
		String input7="Wanna";
		String input8="assainputString lengthsadsad sadas ass inputString";
		String input9="inputString lengthsadsad sadas assa sadas assainputString lengthsadsad";
		
		System.out.println(input1+": "+new LinearHashingAlgorithm().getHash(input1));
		System.out.println(input2+": "+new LinearHashingAlgorithm().getHash(input2));
		System.out.println(input3+": "+new LinearHashingAlgorithm().getHash(input3));
		System.out.println(input9+": "+new LinearHashingAlgorithm().getHash(input9));
		System.out.println(input4+": "+new LinearHashingAlgorithm().getHash(input4));
		System.out.println(input5+": "+new LinearHashingAlgorithm().getHash(input5));
		System.out.println(input6+": "+new LinearHashingAlgorithm().getHash(input6));
		System.out.println(input7+": "+new LinearHashingAlgorithm().getHash(input7));
		System.out.println(input8+": "+new LinearHashingAlgorithm().getHash(input8));
		
	}
}