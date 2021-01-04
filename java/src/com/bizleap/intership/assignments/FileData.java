package com.bizleap.intership.assignments;

public class FileData {

	public class Data {
		private String cid;
		private String email;
		private String phone;

		Data(String cid, String email, String phone) {
			this.cid=cid;
			this.email=email;
			this.phone=phone;
		}

		public String getCId() {
			return cid;
		}

		public String getPhone() {
			return phone;
		}

		public String getEmail() {
			return email;
		}
	}
	class Employee extends FileData{

		private String eid;
		private String fName;
		private String lName;
		private int age;
		private String title;
		private int salary;

		Employee(String eid, String firstName, String lastName, int age, String title, int salary){
			this.eid=eid;
			this.fName=firstName;
			this.lName=lastName;	
			this.age=age;
			this.title=title;
			this.salary=salary;
		}

		public String getEId() {
			return eid;
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
	}
	class Company extends FileData{	

		private String cName;
		private String address;

		Company(String companyName, String address){
			this.cName=companyName;
			this.address=address;
		}

		public String getCompanyName() {
			return cName;
		}

		public String getAddress() {
			return address;
		}
	}
}
