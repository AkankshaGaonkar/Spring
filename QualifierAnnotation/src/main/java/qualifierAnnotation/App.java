package qualifierAnnotation;
import java.io.Writer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Writer writer = context.getBean("frictionWriter",Writer.class);
		writer.write();
		writer.getAward();
		context.close();
	}

}
