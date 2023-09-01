package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooksStep {
	@Given("This is a First")
	public void this_is_a_first() {
	    System.out.println("This is First");
	}
	@When("This is a Second")
	public void this_is_a_second() {
	    System.out.println("This is Second");
	}
	@Then("This is a Third")
	public void this_is_a_third() {
	   System.out.println("This is Third");
	}

}
