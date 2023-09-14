package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	WebDriver driver = null;

	@Given("User must exist in webApplication")
	public void user_must_exist_in_web_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("Open the App in browser")
	public void open_the_app_in_browser() {
		driver.get("https://demo.actitime.com/login.do");
	}

	@When("fill the valid credentials")
	public void fill_the_valid_credentials() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("Homepage must be displayed")
	public void homepage_must_be_displayed() {
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title : "+actualTitle);
		String expecteTitle = actualTitle;
		Assert.assertEquals(actualTitle, expecteTitle,"Home page title mismatch");
		System.out.println("HomePage displayed successfully ");
		
	}
}
