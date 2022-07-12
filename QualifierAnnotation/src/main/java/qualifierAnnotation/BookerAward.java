package qualifierAnnotation;

import org.springframework.stereotype.Component;

@Component
public class BookerAward implements Award {

	@Override
	public void award() {
		
		System.out.println("You got booker prize...");
	}
}