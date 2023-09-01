package stepdefinition;

import io.cucumber.java.en.Given;

public class ExpressionsStep {
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	    System.out.println("Laptop Count " + int1);
	}
	@Given("I have a {double} CGPA")
	public void i_have_a_cgpa(Double double1) {
	  System.out.println("CGPA is " + double1);
	}
	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String string, String string2, String string3) {
	    System.out.println(string + " is elder to " + string2 + " and " + string3);
	}

}
