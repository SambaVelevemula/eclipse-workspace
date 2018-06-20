package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.Operation;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("app.xml");
		
		Operation op=(Operation) con.getBean("op");
		op.k();
	}
}
