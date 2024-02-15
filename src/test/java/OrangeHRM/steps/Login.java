package OrangeHRM.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	WebDriver driver;
	
	@Given("User navigate to the website {string}")
	public void user_navigate_to_the_website(String url) {
		// Write code here that turns the phrase above into concrete actions
				WebDriverManager.chromedriver().setup();
			     driver=new ChromeDriver();  
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver.get(url);
			   
			    
	}
	@When("user logs in through valid username and password  {string} and {string}")
	public void user_logs_in_through_valid_username_and_password_and(String username, String password) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		   driver.findElement(By.xpath("//button[@type='submit']"))
		   .click();
		   System.out.println("login with valid credentials");
	}
	@Then("login must be succesful.  {string}")
	public void login_must_be_succesful(String text) {
		String login=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(login, text);
		System.out.println("logged in");
	}

}
