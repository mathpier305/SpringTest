package com.matt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = (Student) applicationContext.getBean("student_bean");
		student.setStudentName("This is the name of the student");
		
		System.out.println(student.getStudentName());
		
		Student student2 = (Student)applicationContext.getBean("student_bean");
		System.out.println(student2.getStudentName());
	}

}
