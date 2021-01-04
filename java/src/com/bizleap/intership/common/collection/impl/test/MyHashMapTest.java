package com.bizleap.intership.common.collection.impl.test;

import java.util.Random;
import com.bizleap.intership.common.collection.impl.Bucket;
import com.bizleap.intership.common.collection.impl.HashMap;
import com.bizleap.intership.common.collection.impl.HashSet;

public class MyHashMapTest {

	public HashMap populateMap(int size) { 

		HashMap myHashMap= new HashMap();
		for(int i=0; i<size; i++){
			myHashMap.put(makeString(i+1), makeString(i));
		}
		return myHashMap;
	}

	public String makeString(int length) {

		String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		int size=ALPHABET.length();
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			stringbuilder.append(ALPHABET.charAt(random.nextInt(size)));
		}
		return stringbuilder.toString();
	}

	public static void main(String[] args) {
		MyHashMapTest hashingImpl= new MyHashMapTest();
		HashMap myHashMap= hashingImpl.populateMap(100);
		Bucket[] a=myHashMap.getAll();
		for(Bucket bucket:a){
			if(!(bucket==null)){
				System.out.print("{"+bucket.head.getKey()+","+bucket.head.getValue()+"}");
			}
			else System.out.print("");
		}
		System.out.println("\nCapacity: "+myHashMap.getCapacity());

		HashSet myHashSet=new HashSet();
		myHashSet.add("Shine");
		myHashSet.add("Pyae");
		myHashSet.add("Pyae");
		myHashSet.add("Wanna");
		
		myHashSet.display();

		System.out.print("\nIs 'Wanna' already contains: "+myHashSet.add("Wanna"));

		if(myHashSet.contains("Pyae"))
			System.out.println("\nIt is exist");
		else System.out.println("\nNot Exist");

	}
}
