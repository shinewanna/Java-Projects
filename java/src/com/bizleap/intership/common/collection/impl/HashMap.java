/*
 * Implement a hashing utility class, MyHashMap utilizing the hashing method implemented in assignment 8.
The class should have these methods:
1) put ( key, value) --- store the value in the bucket
2) get ( key ) - retrieve the value from the bucket and returns it
3) remove (key) - remove the value form the bucket return true if it is successful
 * */

package com.bizleap.intership.common.collection.impl;

import java.util.List;

import com.bizleap.intership.common.collection.Entry;
import com.bizleap.intership.common.collection.Map;


public class HashMap implements Map{

	private Bucket[] buckets;   //Array of MyLinkedList.
	private int capacity=256;
	private int rehashLinkedListThreshold=50;
	private int rehashDurationThreshold=5;

	public HashMap() {
		buckets = new Bucket[capacity];
	}

	private boolean detectRehashRequired(){
		for(Bucket bucket:buckets) {
			if(!(bucket==null)) {
				System.out.println("The linkedlist size in bucket is "+bucket.size+".");
				if(bucket.size >= rehashLinkedListThreshold)
					return true;
			}
		}
		return false;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	private void rehash(){
		Bucket[] previousBuckets=buckets;
		capacity*=2;
		buckets = new Bucket[capacity];
		System.out.println("The bucket capacity is changed into "+buckets.length+".");
		for(int i=0; i< previousBuckets.length; i++){
			buckets[i] = previousBuckets[i];
		}
	}

	private int getHash(String key) {
		char[] charArray = key.toCharArray();
		int charSum=0;
		for(char singelChar:charArray)
			charSum +=(int)singelChar;

		return ((charSum*2-50)%capacity);
	}

	public void put(String key,String value) {
		if(key==null)
			return; 
		long start=System.currentTimeMillis();
		int hash=getHash(key);
		Bucket bucket = buckets[hash];

		if(bucket == null){
			bucket = new Bucket();
			bucket.add(key, value);
			buckets[hash] = bucket;
		}else{
			bucket.add(key, value);
			//	buckets[hash] = newLinkedList;
		}
		long duration =System.currentTimeMillis()-start;
		if(duration > rehashDurationThreshold && detectRehashRequired()){
			rehash();
		}

	}

	public String get(String key) {
		Bucket bucket=buckets[getHash(key)];
		if(bucket == null)
			return null;
		return bucket.get(key);
	}

	public List<Entry> getAll() {
		return buckets;
	}

	public boolean contains(String key) {
		return get(key) != null;
	}

	public boolean remove(String key) {
		return buckets[getHash(key)].remove(key);
	}

}