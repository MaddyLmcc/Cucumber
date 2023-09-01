package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogle {
	WebDriver driver;
	@Given("User is entering google.co.in")
	public void user_is_entering_google_co_in() {
	   driver = new ChromeDriver();
	   driver.get("http://www.google.co.in" );
	}
	@When("User is typing in search terms {string}")
	public void user_is_typing_in_search_terms(String searchTerm) {
	    driver.findElement(By.name("q")).sendKeys(searchTerm);
	}
	@When("Click the search button")
	public void click_the_search_button() {
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("User see the search results")
	public void user_see_the_search_results() {
	    
	    boolean status = driver.findElement(By.partialLinkText("Madhan")).isDisplayed();
	    if(status) {
	    	System.out.println("This is test");
	    }
	    	
	}

}
