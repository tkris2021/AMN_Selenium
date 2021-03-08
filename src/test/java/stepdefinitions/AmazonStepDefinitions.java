package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonStepDefinitions {
	
	
	  WebDriver driver = null ;
	  
	  
	  @Then("^user launches chrome browse and provide url as \"([^\"]*)\"$")
		public void userLaunchesChromeBrowseAndProvideUrlAs(String url)throws Throwable {
			  System.setProperty("webdriver.chrome.driver","C:\\dev\\Libs\\chromedriver_win32\\chromedriver.exe");
			   	WebDriver driver = new ChromeDriver();
		    	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			    driver.get(url);
		}
	  
	
	 	  
	  @Then("^user asserts the links displayed on the page$")
	  public void user_asserts_the_links_displayed_on_the_page() throws Throwable {
	      
		 
		  Boolean logo = driver.findElement(By.linkText("nav-logo-sprites")).isDisplayed();
		  
		  if (logo){
			  System.out.println("Amazon logo displayed");
		  }
		  
		  Boolean textDisplayed = driver.findElement(By.id("glow-ingress-line2")).isDisplayed();
		  if (textDisplayed){
			  System.out.println("Text displayed");
		  }
		  
			 
	  }

	@Then("^user validate default country is US$")
	public void userValidateDefaultCountryIsUS() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,120);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".icp-nav-flag")));
		  Boolean countryDisplayed = driver.findElement(By.cssSelector(".icp-nav-flag")).isDisplayed();
		  if (countryDisplayed){
			  System.out.println("US Country flag displayed");
		  }
		  driver.close();
		  
		
	}

	
	  
	
	 }
