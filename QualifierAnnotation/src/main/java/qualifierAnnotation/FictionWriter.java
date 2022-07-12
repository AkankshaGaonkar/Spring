package qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter implements Writer {

	@Autowired
	@Qualifier("bookerAward")
	private Award award;

	@Override
	public void write() {
		
		System.out.println("Write Fiction Novels...");
	}

	@Override
	public void getAward() {
		
		award.award();
	}
}