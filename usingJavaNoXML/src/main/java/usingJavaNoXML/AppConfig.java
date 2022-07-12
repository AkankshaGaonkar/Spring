package usingJavaNoXML;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("usingJavaNOXML")
public class AppConfig {

}
//This is a configuration file in Java which is an alternate of the applicationContext.xml file 
//The @Configuration annotation indicates that this is not a simple class but a configuration class 
//The @ComponentScan annotation is used to indicate the component location in our spring project