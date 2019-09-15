package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinitions {

	WebDriver dv ;
	
	@Given("^user is on the login page$")
	public void user_in_login_page(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		dv = new ChromeDriver();
		dv.get("https://classic.crmpro.com");
		dv.manage().window().maximize();
	}
	
	@When("^title of the page is Free CRM$")
	public void title_page(){
		String title = dv.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_values(){
		dv.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		dv.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
	}
	
	@Then("^user clicks on Login button$")
	public void user_clicks_login(){
		WebElement loginBtn = dv.findElement(By.xpath("//input[@type='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor) dv;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^user is on the home page$")
	public void home_page_title(){
		String title = dv.getTitle();
		System.out.println(title);
		
		Assert.assertEquals("CRMPRO",title);
	}
}
