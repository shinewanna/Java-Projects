/*
 Write a program that would return a HashMap for the months in a year in which 
 key being the number of days in the month while value begin the list of month
 that has the same number of days.
 */

package com.bizleap.intership.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class MonthMap {

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

	public Map<Integer, List<String>> callAllData(List<Integer> valueList) {
		Map<Integer, List<String>> hashMap=new HashMap<Integer, List<String>>();

		for(int i:valueList){
			List<String> list=new ArrayList<String>();

			for(Month month:Month.values()){
				if(month.getValue() == i)
					list.add(month.toString());
			}
			hashMap.put(i, list);
		}
		return hashMap;
	}

	public List<Integer> valueList() {
		List<Integer> valueList=new ArrayList<Integer>();
		
		for(Month month:Month.values()){
			if(!valueList.contains(month.getValue()))
				valueList.add(month.getValue());
		}
		return valueList;
	}

	public static void main(String[] args) {
		MonthMap enumlsit=new MonthMap();
		System.out.println("All Months: "+enumlsit.callAllData(enumlsit.valueList()));
	}
}