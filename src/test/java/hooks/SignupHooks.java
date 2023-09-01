package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SignupHooks {
	@Before
	public void beforeGiven() {
		System.out.println("Go to FaceBook home page");
	}
	
	@After
	public void afterThen() {
		System.out.println("Account will be created");
	}

}
