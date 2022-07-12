package ConstructorBasedDependencyInjection;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //annotation indicates that this is not a simple class but a configuration class 
@ComponentScan("ConstructorBasedDependencyInjection") //Annotation is used to indicate the component location in our spring project
public class AppConfig {

}
