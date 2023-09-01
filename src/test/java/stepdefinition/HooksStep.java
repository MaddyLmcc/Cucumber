package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStep {
	@Given("Virat on {int}")
	public void virat_on(Integer int1) {
	    System.out.println("Virat on 94");
	}
	@When("Virat hitting a SIX")
	public void virat_hitting_a_six() {
	    System.out.println("Virat hitting a Six");
	}
	@Then("Virat complete the Century")
	public void virat_complete_the_century() {
	    System.out.println("Virat complete the Century");
	}

}
