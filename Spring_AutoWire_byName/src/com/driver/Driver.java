package com.driver;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Qt;

public class Driver {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("app.xml"); 	
		
		//Resource res=new ClassPathResource("app.xml");
		//BeanFactory context=new XmlBeanFactory(res);
		Qt obj=(Qt)context.getBean("qt",Qt.class);
		obj.display();

	}

}
