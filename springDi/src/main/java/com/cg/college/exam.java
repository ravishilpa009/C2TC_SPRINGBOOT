package com.cg.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exam {
	
	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		student student1 = c.getBean("s1", student.class);
		student1.display();
		student students = c.getBean("s2", student.class);
		students.display();
	}

}
