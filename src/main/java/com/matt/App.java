package com.matt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = (Student) applicationContext.getBean("student_bean");
		student.showInfo();
		
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
