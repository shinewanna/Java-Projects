/*
Implement a hashing utility class, MyHashMap utilizing the hashing method implemented in assignment 8.

The class should have these methods:
1) put ( key, value) --- store the value in the bucket
2) get ( key ) - retrieve the value from the bucket and returns it
3) remove (key) - remove the value form the bucket return true if it is successful

References:
    how is hashmap internally implemented in java using linkedlist or array
    Custom HashMap in Java
 */

package com.bizleap.intership.assignments;

import com.bizleap.intership.common.collection.impl.Bucket;

class MyHashMapp {

	private Entry[] buckets;   
	private int capacity = 256;
	Bucket newLinkedList;

	static class Entry {
		int key;
		String value;
		Entry next;

		public Entry(int key, String value){
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	public MyHashMapp(){
		buckets = new Entry[capacity];
	}

	public void put(int key, String data){

		Entry newEntry = new Entry(key, data);

		if(buckets[key] == null){
			buckets[key] = newEntry;
		}else{
			Entry previous = null;
			Entry current = buckets[key];

			while(current != null){ //we have reached last entry of bucket.
				if(current.key == key){//if put key is found overwrite to the entry.      
					if(previous == null){  //node has to be insert on first of bucket.
						newEntry.next = current.next;
						buckets[key] = newEntry;
						return;
					}
					newEntry.next = current.next;
					previous.next = newEntry;
					return;
				}
				previous=current;
				current = current.next;
			}
			previous.next = newEntry;
		}
	}

	public String get(int key){
		if(buckets[key] == null)
			return null;

		Entry temp = buckets[key];
		while(temp!= null){
			if(temp.key == key) //return the value if input key is equal with Each Entry of key
				return temp.value;
			temp = temp.next; // inserting next entry.
		}         
		return null; 

	}

	public boolean remove(int key){

		if(buckets[key] == null)//return false if not found
			return false;
		//	System.out.print("\n"+table[hash].value);
		Entry previous = null;
		Entry current = buckets[key];

		while(current != null){ 
			if(current.key == key){               
				if(previous == null){  
					buckets[key] = buckets[key].next;//overwrite like shift
					return true;
				}
				previous.next = current.next;//overwrite like shift
				return true;

			}
			previous = current;
			current = current.next;
		}
		return false;
	}

	public void display(){

		for(int i=0;i<capacity;i++){
			if(buckets[i]!=null){
				Entry entry = buckets[i];
				while(entry!=null){
					System.out.print("{"+entry.key+"="+entry.value+"} ");
					entry = entry.next;
				}
			}
		}             
	}
}

public class CustommHashMap {

	public int getHash(String key) {
		int result = 0;

		for(char ch:key.toCharArray())
			result = (result * 31) + ch;

		return Math.abs(result)%255;	
	}

	public void testGeneratedValu() {
		MyHashMapp myHashMap=new MyHashMapp();
		myHashMap.put(getHash("Shine"), "Puck");
		myHashMap.put(getHash("Wanna"), "Phoenix");
		myHashMap.put(getHash("HuHu"), "Tusker");
		myHashMap.put(getHash("Mushi"), "Shaker");
		myHashMap.put(getHash("WaHaHa"), "Tiny");

		System.out.println("get 'Shine' Value: "
				+ myHashMap.get(getHash("Shine")));

		System.out.print("All Data : ");
		myHashMap.display();

		System.out.println("\nvalue corresponding to key 'Shine' removed: "
				+ myHashMap.remove(getHash("Shine")));

		System.out.print("After Removing : ");
		myHashMap.display();
	}

	public static void main(String[] args) {
		new CustommHashMap().testGeneratedValu();
	}
}