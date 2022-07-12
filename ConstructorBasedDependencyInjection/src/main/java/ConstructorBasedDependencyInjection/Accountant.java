package ConstructorBasedDependencyInjection;
import org.springframework.stereotype.Component;
@Component
public class Accountant implements Employee {
	public Accountant()
	{
		System.out.println("Inside Accountant Constructor");
	}
	public void doDance()
	{
		System.out.println("Prepare for dance...");
	}

}
