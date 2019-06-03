package com.ishan.student;

public class F8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees= Employee.getAllEmployees()
				.stream().toArray(Employee[]::new);

	}

}
