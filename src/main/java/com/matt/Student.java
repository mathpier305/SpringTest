package com.matt;

public class Student {

	private String StudentName;

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	public void studentInit() {
		System.out.println("Student Init method called...." );
	}
	
	public void studentDestroy() {
		System.out.println("Student Destroy method called ..." );
	}
}
