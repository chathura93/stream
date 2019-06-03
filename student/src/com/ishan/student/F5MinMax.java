package com.ishan.student;

import java.util.Comparator;
import java.util.Optional;

public class F5MinMax {
	public static void main(String[] args) {
	Optional<Employee>minEmployee=Employee.getAllEmployees().stream().
			min(Comparator.comparing(Employee::getMarks));
	
	System.out.println(minEmployee);
	
	}
}
