package com.bizleap.intership.assignments;

public class MainClass {

	private double one;
	private double two;
	
	public MainClass() {
		one = 0;
		two = 0;
	}
	public MainClass(double one,double two) {
		this.one=one;
		this.two=two;
	}
	public double getAverage() {
		return one+two;
	}
	public void setNum(double one, double two) {
		this.one=one;
		this.two=two;
	}
}
