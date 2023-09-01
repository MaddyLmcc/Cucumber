package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableswithHeaderStep {
	WebDriver driver;
	@Given("user Open the Login Page")
	public void user_open_the_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@When("user Enter the details")
	public void user_enter_the_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   List<Map<String, String>> Keyofpair = dataTable.asMaps(String.class, String.class);
	   String userName = Keyofpair.get(0).get("Username");
	   String password = Keyofpair.get(0).get("Password");
	   driver.findElement(By.name("email")).sendKeys(userName);
	   driver.findElement(By.name("pass")).sendKeys(password);
	}
	@When("user Click the Login button")
	public void user_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

}
