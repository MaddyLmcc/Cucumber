package stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	//Positive Scenario
	WebDriver driver;
	@Given("Open Login Page")
	public void open_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@When("Enter userName {string}")
	public void enter_user_name(String username) {
	    driver.findElement(By.name("email")).sendKeys(username);
	}
	@When("Enter Password {string}")
	public void enter_password(String password) {
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.name("login")).click();
	}
	@Then("Opening Home page")
	public void opening_home_page() {
		System.out.println("Login Successfully");
	}
	
	//Negative Scenario
	@Given("open the login page")
	public void open_the_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@When("enter the wrong username {string}")
	public void enter_the_wrong_username(String string) {
		driver.findElement(By.name("email")).sendKeys(string);
	}
	@When("Enter the Wrong password {string}")
	public void enter_the_wrong_password(String string) {
		driver.findElement(By.name("pass")).sendKeys(string);
	}
	@When("click on the login")
	public void click_on_the_login() {
		driver.findElement(By.name("login")).click();
	}
	@Then("home page")
	public void _home_page() {
		System.out.println("Login Successfully");
	}


}
