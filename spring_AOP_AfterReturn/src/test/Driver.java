package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mailclass.Sample;

public class Driver {
	public static void main(String[] args) {
		
ApplicationContext con=new ClassPathXmlApplicationContext("NewFile.xml");
		
		Sample op=(Sample) con.getBean("sample");
		op.display();
	}
}
