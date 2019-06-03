package com.ishan.student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F5sort {
	
	public static void main(String[] args) {
		List<Employee> sortedEmployees=Employee.getAllEmployees().stream().
				sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
		System.out.println(sortedEmployees);
		
		List<Employee>sortedEmployees1 = Employee.getAllEmployees().stream().
				sorted(Comparator.comparing(Employee::getMarks)).collect(Collectors.toList());
		
		System.out.println(sortedEmployees1);
		
		List<Employee>sortedEmployees2 = Employee.getAllEmployees().stream().
				sorted((e1,e2)-> new Integer(e1.getName().length()).compareTo(e2.
						getName().length())).collect(Collectors.toList());
	}

}
