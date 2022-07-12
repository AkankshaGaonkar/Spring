package springbeanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Writer writer1 = context.getBean("fictionWriter", Writer.class);
		Writer writer2 = context.getBean("fictionWriter", Writer.class);
		
		boolean isSame = writer1 == writer2;
		System.out.println("Instance One :"+writer1);
		System.out.println("Instance One :"+writer2);
		System.out.println("Both bean instances are same: "+isSame);
		
		//writer.write();
		// Close the context
		context.close();
	}
}
