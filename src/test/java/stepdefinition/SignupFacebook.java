package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupFacebook {
	WebDriver driver;
	
	@Given("Go to facebook home page")
	public void go_to_facebook_home_page() {
	    System.out.println("Go to Facebook Home Page");
	}
	@Given("Click on Create an Account button")
	public void click_to_create_an_account_button() {
	    System.out.println("Click on the Create an Account button");
	}
	
	@Given("Go to the Signup page")
	public void go_to_the_signup_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061994%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAh9qdBhAOEiwAvxIok-h_xFjStl7rgfoRrecnzuf7in7zTWoW6tBzmMhGN4gCuEcgQLUGOxoC0PoQAvD_BwE");
	}
	@When("Enter the FirstName {string} and SureName {string}")
	public void enter_the_first_name_and_sure_name(String FirstName, String SureName) throws InterruptedException {
		Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(FirstName);
	   driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(SureName);
	}
	@When("Enter the Email id {string}")
	public void enter_the_email_id(String email) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys(email);
	    
	}
	@When("Enter the New Password {string}")
	public void enter_the_new_password(String password) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys(password);
	    
	}
	@When("Select the Date of birth date {string} and Month {string} and Year {string}")
	public void select_the_date_of_birth_date_and_month_and_year(String date, String month, String year) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='day']")).sendKeys(date);
		driver.findElement(By.xpath("//*[@id='month']")).sendKeys(month);
		driver.findElement(By.xpath("//*[@id='year']")).sendKeys(year);
	    
	}
	
	@When("Select the Gender")
	public void select_the_gender() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Male']")).click();
	  
	}
	@Then("Click the SignUp button")
	public void click_the_sign_up_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println("Account will be created");

	}
	
	//Using Example keyword
	@When("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(string);
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(string2);
	}
	
	@When("Enter the Email id")
	public void enter_the_email_id(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<String> Mail = dataTable.asList(String.class);
	    String email = Mail.get(0);
	    driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys(email);
	}
	
	@When("Enter the New Password")
	public void enter_the_new_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<String> Lock = dataTable.asList(String.class);
	    String Password = Lock.get(0);
	    driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys(Password);
	}


}
