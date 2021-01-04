package com.bizleap.intership.assignments;

import java.util.HashMap;
import java.util.Map;

public class SummationMap {
	
	Map<Integer, Integer> hashmap=new HashMap<Integer, Integer>();
	
	public Map<Integer, Integer> withrecursion(int input) {
		if(input<=1){
			hashmap.put(1, 1);
		}else{
			hashmap.put(input, input+withrecursion(input-1).get(input-1));
		}
		return hashmap;
	}
	
	public Map<Integer, Integer> withloop(int input)  {
		hashmap.clear();
		int result=0;
		for(int initialpoint=1;initialpoint<=input;initialpoint++){
			result+=initialpoint;
			hashmap.put(initialpoint, result);
		}
		return hashmap;
	}
	
	public static void main(String[] args) {
		SummationMap summationMap=new SummationMap();  
		System.out.println("With Recursion: "+summationMap.withrecursion(20)); //input
		System.out.println("With Loop: "+summationMap.withloop(15)); //input
	}
}


