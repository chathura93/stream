package com.ishan.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class F10MapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> students= new HashMap<>();
		students.put("krish",100);
		students.put("Nuwan",90);
		students.put("bhagya",65);
		students.put("kamal",55);
		students.put("ruwan",70);
		

			
	List<String> stringList=new ArrayList<String>();
	
	students.entrySet().stream().filter(e->e.getValue()>=60)
	.sorted((s1,s2)->-s1.getValue().compareTo(s2.getValue()))
	.peek(s->stringList.add(s.getKey())).collect(Collectors.toList());
	
	System.out.println(stringList);
			

		

	
	}
}
