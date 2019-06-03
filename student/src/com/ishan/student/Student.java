package com.ishan.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

	String name;
	LocalDate dob;
	
	public Student(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public static List<Student> getAllStudents(){	
		List<Student> students=new ArrayList<>();
			
			students.add(new Student("ishan", LocalDate.of(1994, 9, 9)));
			students.add(new Student("saman",  LocalDate.of(2015, 9, 9)));
			
			return students;
		}
		
	

}
