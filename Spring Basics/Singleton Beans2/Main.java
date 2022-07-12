package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	  public static void main(String[] args) 
	  {
	      ApplicationContext context = new ClassPathXmlApplicationContext("app.xml"); 
	      Practice obj = (Practice) context.getBean("beanOne"); 
	      Practice object = (Practice) context.getBean("beanTwo");
	      obj.getName();
	      object.getName();
	  }
}
