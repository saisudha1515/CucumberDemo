package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDemo1 {
	WebDriver driver = null;

	@Given("Login page must display")
	public void login_page_must_display() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}

	@When("Fill the valid username")
	public void fill_the_valid_username() {
		driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("Fill the valid password")
	public void fill_the_valid_password() {
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("Click on login")
	public void click_on_login() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("Home page must display")
	public void home_page_must_display() {
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title : " + actualTitle);
		String expecteTitle = actualTitle;
		Assert.assertEquals(actualTitle, expecteTitle, "Home page title mismatch");
		System.out.println("HomePage displayed successfully ");
	}
	
	@When("Fill the invalid username")
	public void fill_the_invalid_username() {
		driver.findElement(By.id("username")).sendKeys("Aadmin");
	}
	
	@When("Fill the invalid password")
	public void fill_the_invalid_password() {
		driver.findElement(By.name("pwd")).sendKeys("Mmanager");
	}
	
	@When("Fill the blank username")
	public void fill_the_blank_username() {
		driver.findElement(By.id("username")).sendKeys("    ");
	}
	
	@When("Fill the blank password")
	public void fill_the_blank_password() {
		driver.findElement(By.name("pwd")).sendKeys("    ");
	}


}
