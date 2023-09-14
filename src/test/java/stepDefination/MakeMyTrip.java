package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeMyTrip {
  
	WebDriver driver;
	
	@Given("home page must be displayed")
	public void home_page_must_be_displayed() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
	    }

	@When("fill the valid credential")
	public void fill_the_valid_credential() {
	WebElement ele=driver.findElement(By.id("fromCity"));	
	ele.click();
	ele.sendKeys("Pune",Keys.DOWN,Keys.ENTER,Keys.TAB,Keys.DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);	
		 }

	@Then("ticket will be succesfully booked")
	public void ticket_will_be_succesfully_booked() {
		
	  }
}
