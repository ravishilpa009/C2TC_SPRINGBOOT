package com.cg.evaluation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class client {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
				
		student s2 = c.getBean("s2",student.class);
        s2.cheating();
        
        Anotherstudent s3 = c.getBean("s3",Anotherstudent.class);
        s3.startCheating();
		

	}

}
