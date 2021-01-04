package com.bizleap.intership.assignments;

import java.util.Random;

import com.bizleap.intership.common.collection.impl.HashMap;

public class HashingImpl {

	public static void main(String[] args) {
		HashingImpl hashingImpl= new HashingImpl();
		HashMap myHashMap= hashingImpl.populateMap(400);
		//myHashMap.reHash();
		myHashMap.getAll();
	}

	public HashMap populateMap(int size){
		HashMap myHashMap= new HashMap();
		for(int i=0; i<size; i++){
			myHashMap.put(makeString(i+1), ""+i);
		}
		return myHashMap;
	}
	
	
	public String makeString(int length){
		String alphabat = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int size=alphabat.length();
		Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < length; i++) 
            sb.append(alphabat.charAt(random.nextInt(size)));
        
        return sb.toString();
	}
}