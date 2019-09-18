package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
//import managers.PageObjectManager;
public class StepTest {
	
	
	 
	
	
	public static  WebDriver driver;
	ConfigFileReader configFileReader;
	//PageObjectManager pageObjectManager;
	 @Test
	@Given("^Open chrome and start application$")
	
	public void open_chrome_and_start_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
		
		configFileReader= new ConfigFileReader();
		 System.setProperty("webdriver.chrome.driver", "C:\\TestDriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hm185100\\Desktop\\form16\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        driver.get(configFileReader.getApplicationUrl());
        
         
	
	}
	 
	 @Test
	@When("^I click on  home_button$")
	public void i_click_on_home_button() {
	    // Write code here that turns the phrase above into concrete actions
		
	

		 driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
	}

	 
	 
	@Then("^user should be able to see welcome on page$")
	public void user_should_be_able_to_see_welcome_on_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
		 System.out.println("Welcome");
	}
	
	 
	 
	@Given("^on Find owners tab$")
	public void on_Find_owners_tab() {
		driver.findElement(By.xpath("//*[contains(text(),'Find owners')]"));  
		System.out.println("Find Owners");
	}
	
	
	  
	@When("^I click on Findowners_link$")
	public void i_click_on_Findowners_link() {
		
		driver.findElement(By.xpath("//*[contains(text(),'Find owners')]")).click();  
	    
	}

	 
	@Then("^user should be able to see Findowners_text on page$")
	public void user_should_be_able_to_see_Findowners_text_on_page() {
		driver.findElement(By.xpath("//*[contains(text(),'Find Owners')]"));
				

	}
	
	
	 
	@Given("^on Find owners page$")
	public void on_Find_owners_page() {
		System.out.println("Find Owners");
	}
	
	
	 
	@When("^I click on Addowner_button$")
	public void i_click_on_Addowner_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		Thread.sleep(5000);


	   
	}
	
	
	 
	@Then("^user should be able to see NewOwner_text on page$")
	public void user_should_be_able_to_see_NewOwner_text_on_page() {
		
		driver.findElement(By.xpath("//*[contains(text(),'New  Owner')]"));
		System.out.println("New  Owner");
	 
	}

	 
	@Given("^on NewOwner page$")
	public void on_NewOwner_page() {
		
		System.out.println("New  Owner");
	}
	
	
	 
	@When("^I enter \"([^\"]*)\" on firstname_textbox$")
	public void i_enter_on_firstname_textbox(String arg1) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
	  
		Thread.sleep(5000);
	}
	
	
	 
	@When("^I enter \"([^\"]*)\" on lastname_textbox$")
	public void i_enter_on_lastname_textbox(String arg1) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("test2");
		
		Thread.sleep(5000);
	}
	
	
	 
	@When("^I enter \"([^\"]*)\" on Address_textbox$")
	public void i_enter_on_Address_textbox(String arg1) throws InterruptedException {
	   
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("kondapur flat 200");
		
		Thread.sleep(5000);
	}

	 
	@When("^I enter \"([^\"]*)\" on city_textbox$")
	public void i_enter_on_city_textbox(String arg1) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("hyderaba");
		Thread.sleep(5000);
	}
	
	 
	@When("^I enter \"([^\"]*)\" on telephone_textbox$")
	public void i_enter_on_telephone_textbox(String arg1) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("7032910508");
		
		Thread.sleep(5000);
	  
	}

	 
	@When("^I click on AddOwner_button$")
	public void i_click_on_AddOwner_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(5000);
		
	}

	 
	@Then("^user should be able to see OwnerInformation_text on page$")
	public void user_should_be_able_to_see_OwnerInformation_text_on_page() {
	   
		
		driver.findElement(By.xpath("//*[contains(text(),'Owner Information')]"));
		
		System.out.println("Owner Information");
		
	}
	

	 
	  public void afterMethod() {
	 
	   // Close the driver
	 
	      driver.quit();

	}


}
