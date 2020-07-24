package com.wipro.inheritance;

public class Employee extends Person{
	private double salary;
	private int year;
	private String insno;
	public Employee(String n,double s,int y,String i) {
		super(n);
		salary=s;
		year=y;
		insno=i;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsno() {
		return insno;
	}
	public void setInsno(String insno) {
		this.insno = insno;
	}
	
}
