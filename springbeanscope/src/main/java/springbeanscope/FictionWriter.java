package springbeanscope;

//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Component
//@Scope
//public class FictionWriter implements Writer {
//
//	@Override
//	public void write() {
//		
//		System.out.println("Write Fiction Novels...");
//	}
//}
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FictionWriter implements Writer {

	@Override
	public void write() {
		
		System.out.println("Write Fiction Novels...");
	}
}