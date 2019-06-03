package com.ishan.student;

import java.util.Comparator;

public class F7ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee.getAllEmployees().forEach(e->
//			System.out.println(e.getName())	
//			
//			);
		
		Employee.getAllEmployees().stream().
				filter(e->e.getName().length()>5)
				.map(e->new Employee(e.getName() ,e.getMarks())).
				sorted(Comparator.comparing(Employee::getName).reversed())
				.forEach(System.out::println);
				
	}

}
