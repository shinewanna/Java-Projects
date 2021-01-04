package com.bizleap.intership.common.collection.impl;

import com.bizleap.intership.common.collection.Map;

public class HashSet {
	private Map map;

	public HashSet() {
		// TODO Auto-generated constructor stub
		map=new HashMap();
	}

	public boolean add(String value){
		if(!contains(value)){
			map.put(value, null);
			return false;
		}
		return true;
	}

	public void display(){
		Bucket[] b=map.getAll();
		for(Bucket bucket:b){
			if(!(bucket==null)){
				System.out.print("{"+bucket.head.getKey()+"}");
			}
			else System.out.print("");
		}
	}
	public boolean contains(String key){
		return map.contains(key);
	}
	public boolean remove(String value){
		return map.remove(value);
	}  
}
