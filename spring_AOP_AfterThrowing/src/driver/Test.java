package driver;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mainclass.MC;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Age Validation");
		System.out.println("---------------");
		System.out.println();
		System.out.print("Enter Your Age : ");
		int age=sc.nextInt();
		System.out.println();
		ApplicationContext con=new ClassPathXmlApplicationContext("app.xml");
		MC obj=(MC)con.getBean("mainclass");
		try {
			System.out.println();
			obj.valid(age);
		} catch (Exception e) {
			
		}
		finally {
			sc.close();
		}
	}
}

