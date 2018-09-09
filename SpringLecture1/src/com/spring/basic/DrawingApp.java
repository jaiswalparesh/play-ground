package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Triangle t = (Triangle)factory.getBean("triangle");
		t.draw();
	}
}
