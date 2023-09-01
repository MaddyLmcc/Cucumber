package taggedhooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks {
	
	@Before
	public void beforeScenario() {
		System.out.println("This will be execute before every scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("This will be execute after every scenario ");
	}
	@Before("@First")
	public void beforeFirstScenario() {
		System.out.println("This will be execute before First scenario");
	}
	
	@Before("@Second")
	public void beforeSecondScenario() {
		System.out.println("This will be execute before Second scenario");
	}
	
	@Before("@Third")
	public void beforeThirdScenario() {
		System.out.println("This will be execute before Third scenario");
	}
	
	@After("@First")
	public void afterFirstScenario() {
		System.out.println("This will be execute after First scenario ");
	}
	
	@After("@Second")
	public void afterSecondScenario() {
		System.out.println("This will be execute after Second scenario ");
	}
	
	@After("@Third")
	public void afterThirdScenario() {
		System.out.println("This will be execute after Third scenario ");
	}

}
