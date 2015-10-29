package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSteps {
    WebDriver driver = new FirefoxDriver();

	@Given("^User is on autobars BA login page$")
	public void user_is_on_autobars_BA_login_page() throws Throwable {
		// Create a new instance of the Firefox driver
		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         //Launch the Autobars alpha prototype url
         driver.get("http://alpha.autobars-voa-gov.uk/");
	    throw new PendingException();
	}

	@When("^User navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        driver.get("http://alpha.autobars-voa-gov.uk/");
	    throw new PendingException();
	}

	@When("^User enters Username and Password$")
	public void user_enters_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("UserName")).sendKeys("ealing"); 
        driver.findElement(By.id("UserPassword")).sendKeys("japanesenods");

	    throw new PendingException();
	}

	@And ("User clicks Submit$")
	public void user_clicks_submit() throws Throwable {
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div/form/p[4]/input")).click();
	
	}

	@Then("^Message displayed Welcome Ealing Council page$")
	public void message_displayed_Welcome_Ealing_Council_page() throws Throwable {
        System.out.println("Welcome Ealing Council ");
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	    throw new PendingException();
	}

	@When("^user Logout from the autobars application$")
	public void user_Logout_from_the_autobars_application() throws Throwable {
		
        driver.findElement (By.linkText ("Logout")).click();

		
	    throw new PendingException();
	}
	
	

	@Then("^Message displayed Welcome to the Valuation Office Agency$")
	public void message_displayed_Welcome_to_the_Valuation_Office_Agency() throws Throwable {

        System.out.println("LogOut Successfully");

		
		throw new PendingException();
	}

	
}
