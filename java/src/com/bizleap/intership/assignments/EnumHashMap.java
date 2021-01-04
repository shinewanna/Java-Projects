package com.bizleap.intership.assignments;

import java.util.*;

public class EnumHashMap {
	
	public enum Month {
	    January(31),
	    February(28),
	    March(31),
	    April(30),
	    May(31),
	    June(30),
	    July(31),
	    August(31),
	    September(30),
	    October(31),
	    November(30),
	    December(31);

	    private int value;
	    
	    Month(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
	}

	   public List<Integer> callHash() {
		   
	   Map<String, Integer> hashmap=new HashMap<String, Integer>();
	   for(Month month:Month.values()){
	   		hashmap.put(month.toString(), month.getValue());
	   }
	   
	   List<Integer> list=new ArrayList<Integer>();
	   for(Map.Entry<String, Integer> entry : hashmap.entrySet()){
	   		list.add(entry.getValue());
	   }
	   return list;
	}
	
	public static void main(String[] args) {
		EnumHashMap enumhasmap=new EnumHashMap();
		List<Integer> resultList=enumhasmap.callHash();
		String firstoutput="";
		String secondoutput="";
		System.out.println("List of same month: ");
		
		for(int i=0;i<resultList.size();i++){
			if(resultList.get(i)==28)
				System.out.println(28+"\n");
			else if(resultList.get(i)==30)
				firstoutput+=30+"\n";
			else if(resultList.get(i)==31)
				secondoutput+=31+"\n";
				
		}
		System.out.println(firstoutput+"\n"+secondoutput);
	}
}
