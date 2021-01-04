package com.bizleap.intership.common.collection.impl;


public class Node {
	 String key,value; 
    Node next; 
    Node(String key, String value) {
    	this.key= key;
    	this.value=value;
    	next= null;
    }
		
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNext() {
			return next;
	}
	public void setNext(Node next) {
			this.next = next;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + ", next=" + next + "]";
	}  
}
