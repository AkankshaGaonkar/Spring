package qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TechnicalWriter implements Writer{

	@Autowired
	@Qualifier("pulitzerAward")
	private Award award;

	@Override
	public void write() {
		
		System.out.println("Write technical stuffs...");
	}

	@Override
	public void getAward() {
		award.award();
		
	}
}