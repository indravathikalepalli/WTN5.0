package com.wipro.inheritance;

public class TestEmployee {
	public static void main(String[] args) {
		//Person p=new Person("Indravathi");
		Employee e= new Employee("Indu",30000,2017,"AB15434C");
		e.setSalary(35000);
		e.setInsno("AA12145B");
		System.out.println("Name of employee is "+e.getName());
		System.out.println("Year of joining is "+e.getYear());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("National Insurance number is "+e.getInsno());
	}
}
