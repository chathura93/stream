package com.ishan.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>employeeList=Employee.getAllEmployees().stream().
					filter(e->e.getName().length()>5).collect(Collectors.toList());
		
		System.out.println(employeeList);
	}
	}


