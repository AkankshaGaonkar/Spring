package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; //This API loads beans configuration file and eventually based on the provided API, it takes care of creating and initializing all the objects, i.e. beans

public class MainApp {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	      HelloWorld obj = (HelloWorld) context.getBean("beanOne"); //uses bean ID to return a generic object, which finally can be casted to the actual object.
	      obj.getMessage();
	   }

}
