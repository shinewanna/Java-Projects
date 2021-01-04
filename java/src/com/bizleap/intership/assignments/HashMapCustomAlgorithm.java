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

class HashMapCustom<K, V> {

	private Entry<K,V>[] table;   //Array of Entry.
	private int capacity= 256;  //Initial capacity of HashMap

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K,V> next;

		public Entry(K key, V value, Entry<K,V> next){
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	@SuppressWarnings("unchecked")
	public HashMapCustom(){
		table = new Entry[capacity];
	}

	public void put(K newKey, V data){
		if(newKey==null)
			return;    //does not allow to store null.

		int hash=Integer.parseInt(newKey.toString());
		//create new entry.
		Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);

		//if table location does not contain any entry, store entry there.
		if(table[hash] == null){
			table[hash] = newEntry;
		}else{
			Entry<K,V> previous = null;
			Entry<K,V> current = table[hash];

			while(current != null){ //we have reached last entry of bucket.
				if(current.key.equals(newKey)){//if put key is found overwrite to the entry.      
					if(previous==null){  //node has to be insert on first of bucket.
						newEntry.next=current.next;
						table[hash]=newEntry;
						return;
					}
					else{
						newEntry.next=current.next;
						previous.next=newEntry;
						return;
					}
				}
				previous=current;
				current = current.next;
			}
			previous.next = newEntry;
		}
	}

	public V get(K key){
		int hash = Integer.parseInt(key.toString());
		if(table[hash] == null){
			return null;
		}else{
			Entry<K,V> temp = table[hash];
			while(temp!= null){
				if(temp.key.equals(key)) //return the value if input key is equal with Each Entry of key
					return temp.value;
				temp = temp.next; // inserting next entry.
			}         
			return null; 
		}
	}

	public boolean remove(K deleteKey){

		int hash=Integer.parseInt(deleteKey.toString());

		if(table[hash] == null){//return false if not found
			return false;
		}else{
			//	System.out.print("\n"+table[hash].value);
			Entry<K,V> previous = null;
			Entry<K,V> current = table[hash];

			while(current != null){ 
				if(current.key.equals(deleteKey)){               
					if(previous==null){  
						table[hash]=table[hash].next;//overwrite like shift
						return true;
					}
					else{
						previous.next=current.next;//overwrite like shift
						return true;
					}
				}
				previous=current;
				current = current.next;
			}
			return false;
		}
	}

	public void display(){

		for(int i=0;i<capacity;i++){
			if(table[i]!=null){
				Entry<K, V> entry=table[i];
				while(entry!=null){
					System.out.print("{"+entry.key+"="+entry.value+"} ");
					entry=entry.next;
				}
			}
		}             
	}
}

public class HashMapCustomAlgorithm {

	public int getHash(String key) {
		int result = 0;

		for(char ch:key.toCharArray()){
			result = (result * 31) + ch;
		}
		
		return Math.abs(result)%255;	
	}
	public void testGeneratedValue() {
		HashMapCustom<Integer, String> hashMapCustom = new HashMapCustom<Integer, String>();
		hashMapCustom.put(getHash("Shine"), "Puck");
		hashMapCustom.put(getHash("Wanna"), "Phoenix");
		hashMapCustom.put(getHash("HuHu"), "Tusker");
		hashMapCustom.put(getHash("Mushi"), "Shaker");
		hashMapCustom.put(getHash("WaHaHa"), "Tiny");

		System.out.println("get 'Shine' Value: "
				+ hashMapCustom.get(getHash("Shine")));

		System.out.print("All Data : ");
		hashMapCustom.display();

		System.out.println("\nvalue corresponding to key 'Shine' removed: "
				+ hashMapCustom.remove(getHash("Shine")));

		System.out.print("After Removing : ");
		hashMapCustom.display();
	}

	public static void main(String[] args) {
		new HashMapCustomAlgorithm().testGeneratedValue();
	}
}