package ConstructorBasedDependencyInjection;
//code to create an IOC container for our application. 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//The AnnotationConfigApplicationContext class is used to create an object for application context.
		Manager manager = context.getBean(Manager.class);
		manager.doDance();
		manager.callMetting();
		context.close();
	}

}
