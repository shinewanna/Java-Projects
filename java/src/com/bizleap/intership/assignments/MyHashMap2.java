package com.bizleap.intership.assignments;


import java.sql.Array;

import com.bizleap.intership.common.collection.impl.Bucket;

public class MyHashMap2 {
	
	private Array[] bucket;
	private int capacity = 256;
	Bucket newLinkedList;
	
	public MyHashMap2() {
		bucket = new Array[capacity];
	}
	
	public int getHash(String key) {
		int result = 0;

		for(char ch:key.toCharArray()){
			result = (result * 31) + ch;
		}
		
		return Math.abs(result)%255;	
	}
	
	public void put(String key, String value) {
		System.out.print(key+"   "+value);
		if(key == null) 
			return;
		int hash = getHash(key);
		
		if(bucket[hash] == null) {
			newLinkedList = new Bucket();
			newLinkedList.add(key, value);
			bucket[hash] = (Array)newLinkedList;
		}
		else 
			newLinkedList.add(key, value);
	}
	
	public String get(String key) {
		if(key == null) 
			return null;
		
		int hash = getHash(key);
		String value = null;
		if(bucket[hash] == null)
			return null;
		else {
			
		}
		return value;
	}
	
	public boolean remove(String key) {
		return newLinkedList.remove(getHash(key));
	}
	public static void main(String[] args) {
		new MyHashMap2().put("abc", "lol");	
	}
}
