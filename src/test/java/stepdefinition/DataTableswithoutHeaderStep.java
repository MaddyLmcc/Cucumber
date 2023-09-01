package stepdefinition;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataTableswithoutHeaderStep {
	WebDriver driver;
	@Given("Open the Login Page")
	public void open_the_login_page() {
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@When("Enter the userName and password")
	public void enter_the_user_name_and_password(DataTable dataTable) {
	 List<String> details = dataTable.asList(String.class);
	   String username = details.get(0);
	   String password = details.get(1);
	   driver.findElement(By.name("email")).sendKeys(username);
	   driver.findElement(By.name("pass")).sendKeys(password);
	   }
	@When("Click the Login button")
	public void click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}
	@Then("Open Home page of the user")
	public void open_home_page_of_the_user() {
		 System.out.println("Login Successfully");
	}

}
