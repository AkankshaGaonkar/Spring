//This code is used to create IOC container for the application
package usingJavaNoXML;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //used to create the object for the application context
		Accountant employee = context.getBean(Accountant.class);
		employee.doWork();
		context.close();
	}
}
