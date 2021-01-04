/*
    Assignment 4
    There are three persons and three companies (you can add more):
    Alice Kim -- works for Apple
    Bob Gilman -- works for IBM
    John Mark -- works for Adobe
    
    1) Write a java program that will read the above employees' first name, last name, age, title, salary, email, phone ( add more fields to above people) from a file as well as to read the company names, address, phone, email, CEO (make up some one for each company) from a second file and print out the company then it's employee(s) for all companies.
    2) Find out what commonality do the two entity classes have and reimplement it by using the inheritance features of Java. 
*/

package com.bizleap.intership.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EmpComFileReader {

	public List<Employee> employee(List<Employee> employee) throws Exception{
		BufferedReader brEmployee=new BufferedReader(new FileReader("employee.txt"));
		String eachValue;String eId,ecId,firstName,lastName,title,email,phone;
		int age,salary;

		while((eachValue=brEmployee.readLine()) != null){
			StringTokenizer st=new StringTokenizer(eachValue,",");
			eId=st.nextToken();
			ecId=st.nextToken();
			firstName=st.nextToken();
			lastName=st.nextToken();
			age=Integer.parseInt(st.nextToken());
			title=st.nextToken();
			salary=Integer.parseInt(st.nextToken());
			email=st.nextToken();
			phone=st.nextToken();
			employee.add(new Employee(eId, ecId,firstName, lastName, age, title, salary, email, phone));
		}
		brEmployee.close();
		return employee;
	}

	public List<Company> company(List<Company> company) throws Exception{
		BufferedReader brCompany=new BufferedReader(new FileReader("company.txt"));
		String cId,eachValue,companyName,address,phone,email,ceo;

		while((eachValue=brCompany.readLine()) != null){
			StringTokenizer st=new StringTokenizer(eachValue,",");
			cId=st.nextToken();
			companyName=st.nextToken();
			address=st.nextToken();
			phone=st.nextToken();
			email=st.nextToken();
			ceo=st.nextToken();
			company.add(new Company(cId, companyName, address, phone, email, ceo));
		}
		brCompany.close();
		return company;
	}

	public String getResult(List<Employee> employee, List<Company> company) {
		String result="";

		for(Company companyItem:company){
			for(Employee employeeItem:employee){

				if(companyItem.getCId().equals(employeeItem.getECId()))
					result+= employeeItem.getFirstName()+" "+employeeItem
					.getLastName() +" -- works for "+companyItem.getCompanyName()+"\n";
			}
		}
		return result;
	}


	public static void main(String[] args) throws Exception {
		List<Employee> employee=new ArrayList<Employee>();
		List<Company> company=new ArrayList<Company>();
		EmpComFileReader empcomfilereader = new EmpComFileReader();
		System.out.print(empcomfilereader.getResult(empcomfilereader.employee(employee), empcomfilereader.company(company)));
	}
}