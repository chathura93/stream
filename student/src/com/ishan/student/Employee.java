package com.ishan.student;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	String name;
	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	Integer marks;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "Empployee[name="+name+",marks="+marks+"]";
	}
	public static List<Employee> getAllEmployees(){	
	List<Employee> employees=new ArrayList<>();
		
		employees.add(new Employee("ishan", 90));
		employees.add(new Employee("saman", 95));
		employees.add(new Employee("kamal", 70));
		employees.add(new Employee("ruwan", 75));
		employees.add(new Employee("chamath", 65));
		employees.add(new Employee("nimal", 85));
		return employees;
	}
	
	
}
