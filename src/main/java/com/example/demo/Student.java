package com.example.demo;

public class Student {
	private String studentName;
	private int id;

	
	
	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}



	void displayStudentInfo() {
		System.out.println("studnet name is "+ studentName +" and is id is "+ id);
	}
}
