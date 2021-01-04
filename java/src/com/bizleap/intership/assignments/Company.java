package com.bizleap.intership.assignments;

public class Company {

	private String cid;
	private String cName;
	private String address;
	private String phone;
	private String email;
	private String ceo;
	
	Company(String cId, String companyName, String address, String phone, String email, String ceo){
		this.cid=cId;
		this.cName=companyName;
		this.address=address;
		this.phone=phone;
		this.email=email;
		this.ceo=ceo;
	}

	public String getCId() {
		return cid;
	}
	
	public String getCompanyName() {
		return cName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCEO() {
		return ceo;
	}
}