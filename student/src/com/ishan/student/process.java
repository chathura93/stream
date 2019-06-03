package com.ishan.student;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class process {
	
	public static void main(String[] args) {
	
		List<Employee> employeeList=Employee.getAllEmployees().
				stream().map(e->new Employee("Eng :"+e.getName())).collect(Collectors.toList());
		
		List<Employee> employeeMarkList=Employee.getAllEmployees().
				stream().filter(e->e.getName().contains("i")).map
				(e->new Employee(e.getName(),e.getMarks()*3)).collect(Collectors.toList());
		
//		System.out.println(employeeList);
//		System.out.println(employeeMarkList);
		
		List<Student> studentList = Student.getAllStudents().stream().filter
				(e->(e.getDob().getYear() - LocalDate.now().getYear())*-1>18).collect(Collectors.toList());
		
		System.out.println(studentList);
}
}