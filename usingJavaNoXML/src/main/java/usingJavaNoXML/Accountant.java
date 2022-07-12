package usingJavaNoXML;
import org.springframework.stereotype.Component;
@Component

public class Accountant implements Employee{
	public void doWork() 
	{	
		System.out.println("Audit the accounts...");
	}
}
//This is a component class that is marked using @Component annotation.
//It implements the Employee interface and overrides its method doWork().

