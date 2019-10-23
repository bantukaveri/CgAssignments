package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static ApplicationContext context;
public static void main(String[] args) {
	
	
	context = new ClassPathXmlApplicationContext(new String[] {"customerbean.xml"});
	Customer c=(Customer)context.getBean("CustomerBean");
	System.out.println(c);
}
}
