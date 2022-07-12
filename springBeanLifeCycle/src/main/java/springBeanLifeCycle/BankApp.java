//It is a configuration file that reads the applicationContext file and get Bean using the getBean() method and then call method based on the retrieved object.
package springBeanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class BankApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) context.getBean("manager");
		employee.doWork();
		context.close();
	}
}