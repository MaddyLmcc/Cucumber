package background;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundStep {
	
	@Given("First will come to the bank")
	public void first_will_come_to_the_bank() {
		System.out.println("First will come to the bank");
	}
	
	@Given("Enter the user details in form")
	public void enter_the_user_details_in_form() {
		System.out.println("Enter the user details in form");
	    
	}
	@When("Attached Photo to the user")
	public void attached_photo_to_the_user() {
		System.out.println("Attached Photo to the user");
	}
	@Then("Account will be opened")
	public void account_will_be_opened() {
		System.out.println("Account will be opened");
	}
	
	@Given("Fill Accont details in the form")
	public void fill_accont_details_in_the_form() {
		System.out.println("Fill Accont details in the form");
	}
	@When("User give a form to cashier")
	public void user_give_a_form_to_cashier() {
		System.out.println("User give a form to cashier");
	}
	@Then("Amount will be debited")
	public void amount_will_be_debited() {
		System.out.println("Amount will be debited");
	}


}
