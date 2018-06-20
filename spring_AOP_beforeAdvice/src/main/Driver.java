package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.Test;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("app.xml");
		
		Test obj=(Test)con.getBean("proxy");
		obj.display();
	}

}
