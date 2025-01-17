package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutobarsLoginSeleniumTest {
		private static WebDriver driver = null;
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Autobars alpha prototype url
 
        driver.get("http://alpha.autobars-voa-gov.uk/");
 
        // Find the element that's ID attribute is 'username' (Username)
        
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("UserName")).sendKeys("ealing"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("UserPassword")).sendKeys("japanesenods");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div/form/p[4]/input")).click();
		
         // Print a Log In message to the screen
 
        System.out.println("Welcome Ealing Council ");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
 
        driver.findElement (By.linkText ("Logout")).click();
        
        // Print a Log In message to the screen
        
        System.out.println("LogOut Successfully");
 
        // Close the driver
 
        driver.quit();

	}

}