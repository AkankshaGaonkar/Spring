package ConstructorBasedDependencyInjection;
import org.springframework.stereotype.Component;
@Component 
public class Manager implements Employee {
	Accountant accountant; 
	public Manager(Accountant accountant)//Manager class calls a method of Accountant class by using the Accountant class object which is instantiated inside the Manager class constructor
	{
		System.out.println("manager constructor");
		this.accountant = accountant;
	}
	public void doDance()
	{
		System.out.println("Dance in the branch Office");
	}
	public void callMetting()
	{
		
		accountant.doDance();
	}

}
