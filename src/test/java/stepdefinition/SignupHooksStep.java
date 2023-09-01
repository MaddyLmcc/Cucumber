package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupHooksStep {
	WebDriver driver;
	
	@Given("Go on the Signup page")
	public void go_on_the_signup_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061994%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAh9qdBhAOEiwAvxIok-h_xFjStl7rgfoRrecnzuf7in7zTWoW6tBzmMhGN4gCuEcgQLUGOxoC0PoQAvD_BwE");
	}
	@When("Enter FirstName {string} and SureName {string}")
	public void enter_first_name_and_sure_name(String FirstName, String SureName) {
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(FirstName);
		   driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(SureName);
	}
	@When("Enter Email id {string}")
	public void enter_email_id(String email) {
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys(email);
	}
	@When("Enter New Password {string}")
	public void enter_new_password(String password) {
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys(password);
	}
	@When("Select Date of birth date {string} and Month {string} and Year {string}")
	public void select_date_of_birth_date_and_month_and_year(String date, String month, String year) {
		driver.findElement(By.xpath("//*[@id='day']")).sendKeys(date);
		driver.findElement(By.xpath("//*[@id='month']")).sendKeys(month);
		driver.findElement(By.xpath("//*[@id='year']")).sendKeys(year);
	}
	@When("Select Gender")
	public void select_gender() {
		driver.findElement(By.xpath("//*[text()='Male']")).click();
	}
	@Then("Click SignUp button")
	public void click_sign_up_button() {
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}


}
