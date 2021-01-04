package com.bizleap.intership.assignments;

class LinkedHashMap {
	
	private Entry[] buckets;
	private int capacity=256;
	private Entry head;
	private Entry tail;
	static class Entry
	{
		int key;
		String value;
		Entry next;
		Entry before;
		Entry after;
		public Entry(int key ,String value,Entry next)
		{
			this.key=key;
			this.value=value;
			this.next=next;
		}   
	}
	public LinkedHashMap()
	{
		buckets=new Entry[capacity];    
	}
	public void put(int key,String value)
	{

		boolean replace=false;
		Entry newEntry = new Entry(key, value, null);
		//insert in bucket
		//  maintainOrderAfterInsert(newEntry);  
		Entry curr=buckets[key];

		if(curr==null)
		{
			buckets[key]=newEntry;
		}
		else
		{
			Entry prev=null;
			while(curr!=null)
			{
				if(curr.key==key)
				{
					replace=true;
					curr.value=value;
					break;
				}
				prev=curr;
				curr=curr.next;
			}
			if(prev!=null)
				prev.next=newEntry;
		}
		//newEntry.next=curr;
		//buckets[hash]=newEntry;
		if(replace==false)
			insertInList(newEntry);
		//buckets[hash]=newEntry;
	}
	private void insertInList(Entry newEntry)
	{
		if(head==null)
		{
			head=newEntry;
			tail=newEntry;
		}
		else
		{
			tail.after=newEntry;
			newEntry.before=tail;
			tail=newEntry;
		}
	}
	public String get(int key)
	{   
		Entry curr=buckets[key];
		while(curr!=null)
		{
			if(curr.key==key)
			{
				return curr.value;
			}
			curr=curr.next;
		}
		return null;
	}

	public void print()
	{
		Entry curr=head;
		while(curr!=null)
		{
			System.out.println("key is "+ curr.key+"val is "+ curr.value+"->");   
			curr=curr.after;
		}
	}   

	public void remove(int key)
	{
		Entry curr=buckets[key];
		if(curr==null)//no exist
		{
			return;
		}
		Entry p=null;
		Entry n;
		while(curr!=null)
		{
			n=curr.next;
			if(curr.key==key)
			{
				if(p==null)//first
				{
					buckets[key]=buckets[key].next;
				}
				else
				{
					p.next=n;
				}
				//adjust Linked List
				adjustList(curr);
				break;
			}
			p=curr;
			curr=n;
		}

	}
	private void adjustList(Entry curr)
	{
		if(curr==head)
		{
			head=head.after;
			if(head==null)
			{
				tail=null;
			}
		} 
		else if (curr==tail)
		{
			tail=tail.before;
			tail.after=null;
		}
		else
		{
			curr.before.after=curr.after;
			curr.after.before=curr.before;
		}
	}
	public void deleteAll()
	{
		head=null;
		tail=null;
		for(int i=0;i<capacity;i++)
		{
			buckets[i]=null;
		}   
	}
}

public class CustomLinkedHashMap {

	public int getHash(String key) {
		int result = 0;

		for(char ch:key.toCharArray())
			result = (result * 31) + ch;

		return Math.abs(result)%255;	
	}

	public void testGeneratedValu() {
		LinkedHashMap linkedhashmap=new LinkedHashMap();
		linkedhashmap.put(getHash("Shine"), "Puck");
		linkedhashmap.put(getHash("Wanna"), "Phoenix");
		linkedhashmap.put(getHash("HuHu"), "Tusker");
		linkedhashmap.put(getHash("Mushi"), "Shaker");
		linkedhashmap.put(getHash("WaHaHa"), "Tiny");

		System.out.println("get 'Shine' Value: "
				+ linkedhashmap.get(getHash("Shine")));

		System.out.println("All Data : ");
		linkedhashmap.print();

		linkedhashmap.remove(getHash("Shine"));

		System.out.print("After Removing : ");
		linkedhashmap.print();
	}

	public static void main(String[] args) {
		new CustomLinkedHashMap().testGeneratedValu();
	}
}