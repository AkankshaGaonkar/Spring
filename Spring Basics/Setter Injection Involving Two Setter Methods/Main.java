package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	  public static void main(String[] args) 
	  {
	      ApplicationContext context = new ClassPathXmlApplicationContext("app.xml"); 
	      Test obj = (Test) context.getBean("beanOne"); 
	      Test object = (Test) context.getBean("beanTwo");
	      obj.getName();
	      object.getName();
	      
	  }
}
