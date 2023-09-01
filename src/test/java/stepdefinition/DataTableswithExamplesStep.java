package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableswithExamplesStep {
	WebDriver driver;
	@Given("user Open  Login Page")
	public void user_open_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@When("user Enter the details {string} and {string}")
	public void user_enter_the_details_and(String string, String string2) {
		driver.findElement(By.name("email")).sendKeys(string);
		driver.findElement(By.name("pass")).sendKeys(string2);
	}
	@When("user Click Login button")
	public void user_click_login_button() {
		driver.findElement(By.name("login")).click();
	}
	@Then("Open Home page")
	public void open_home_page() {
		System.out.println("Login Successfully");
	}


}
