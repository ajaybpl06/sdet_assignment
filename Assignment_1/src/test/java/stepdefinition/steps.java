package stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import junit.framework.Assert;

public class steps {
	WebDriver driver;
	String Login_URL = "http://elearningm1.upskills.in/";
	String Username ="Ajay";
	String Password ="Assignment@1";
	
	
	@Before
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver","F://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest() {
		   driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a")).click();
		   driver.findElement(By.xpath("//*[@id=\"logout_button\"]")).click();
		   driver.close();
	}
	
	
	
	
	
	// ############################  Scenario 1   ############################################################################
	
	
	@Given("^User wants to login to elearning$")
	public void user_wants_to_login_to_elearning()  {
		
		driver.get(Login_URL);
	}

	@When("^User enters the valid credentials Username & Password and hit login button$")
	public void user_enters_the_valid_credentials_Username_Password_and_hit_login_button() throws InterruptedException  {
	        driver.findElement(By.id("login")).sendKeys(Username);
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.id("form-login_submitAuth")).click();
			Thread.sleep(3000);
	}

	@Then("^User Logged in and by default application will land on MyCourses Screen$")
	public void user_Logged_in_and_by_default_application_will_land_on_MyCourses_Screen()  {
		String actual = "Hello Ajay Rathore and welcome,";
		String expected = driver.findElement(By.xpath("//*[@id=\"homepage-course\"]/div/p[1]")).getText();
		   Assert.assertEquals(expected, actual);
	}
	
// ############################  Scenario 2 - Home Page Validation   #################################################################	

	
	
	@Given("^User is logged in and wants to navigate to homepage$")
	public void user_is_logged_in_and_wants_to_navigate_to_homepage() throws InterruptedException  {
	
			driver.get(Login_URL);
			driver.findElement(By.id("login")).sendKeys(Username);
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.id("form-login_submitAuth")).click();
			Thread.sleep(3000);
	}

	@When("^User clicks on HomePage tab$")
	public void user_clicks_on_HomePage_tab()  {
	
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]/a")).click(); 
	   
	}

	@Then("^application display the HomePage to the user$")
	public void application_display_the_HomePage_to_the_user()  {
	   
		  String actual = "Profile";
		  String expected = driver.findElement(By.xpath("//*[@id=\"profile_block\"]/div[1]")).getText();
		  Assert.assertEquals(expected, actual);
	}
	
	
// ############################ Scenario 3 Validate Social Network  #################################################################	

	
	@Given("^User is logged in and wants to navigate to Social network$")
	public void user_is_logged_in_and_wants_to_navigate_to_Social_network() throws InterruptedException  {

		driver.get(Login_URL);		
		driver.findElement(By.id("login")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("form-login_submitAuth")).click();
		Thread.sleep(3000);
	   
	}

	@When("^User clicks on Social network tab$")
	public void user_clicks_on_Social_network_tab() throws Throwable {
	   
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
	   
	}

	@Then("^Application display the Social network screen to the user$")
	public void application_display_the_Social_network_screen_to_the_user()  {
	  String actual = "Social network";
	  String expected= driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/ul/li")).getText();
	  Assert.assertEquals(expected, actual);
	}
	
	
}