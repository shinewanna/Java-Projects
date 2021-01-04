package com.bizleap.intership.assignments;

public class Employee {
	
	private String eid;
	private String cid;
	private String fName;
	private String lName;
	private int age;
	private String title;
	private int salary;
	private String email;
	private String phone;

	Employee(String eid, String cid,String firstName, String lastName, int age, String title, int salary, String email,String phone){
		this.eid=eid;
		this.cid=cid;
		this.fName=firstName;
		this.lName=lastName;	
		this.age=age;
		this.title=title;
		this.salary=salary;
		this.email=email;
		this.phone=phone;
	}
	
	public String getEId() {
		return eid;
	}
	
	public String getECId() {
		return cid;
	}
	
	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
}