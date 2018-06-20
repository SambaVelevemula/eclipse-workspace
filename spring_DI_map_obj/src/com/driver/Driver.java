package com.driver;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.qt.Qt;

public class Driver {
	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Qt obj=(Qt)factory.getBean("qt");
		obj.display();
	}
}
