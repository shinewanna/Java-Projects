package com.bizleap.intership.assignments;

public class TesterClass {

	public static void main(String[] args) {
		MainClass[] classes=new MainClass[2];
		MainClass mainClass=new MainClass();
		classes[1]=new MainClass(200,100);
		System.out.println(mainClass.getAverage());
		mainClass.setNum(100, 400);
		System.out.print(mainClass.getAverage());

	}

}
