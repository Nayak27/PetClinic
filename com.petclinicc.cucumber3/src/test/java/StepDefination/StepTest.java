package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
//import managers.PageObjectManager;
public class StepTest  {
	

	
	public static  WebDriver driver;
	ConfigFileReader configFileReader;
	//PageObjectManager pageObjectManager;
	@Test
	@Given("^Open chrome and start application$")
	
	public void a_open_chrome_and_start_application() throws Throwable {
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
	public void b_i_click_on_home_button() {
	    // Write code here that turns the phrase above into concrete actions
		
	

		 driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
	}
	@Test
	@Then("^user should be able to see welcome on page$")
	public void c_user_should_be_able_to_see_welcome_on_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
		 System.out.println("Welcome");
	}

	@Given("^on Find owners tab$")
	public void d_on_Find_owners_tab() {
		driver.findElement(By.xpath("//*[contains(text(),'Find owners')]"));  
		System.out.println("Find Owners");
	}
	@Test
	@When("^I click on Findowners_link$")
	public void e_i_click_on_Findowners_link() {
		
		driver.findElement(By.xpath("//*[contains(text(),'Find owners')]")).click();  
	    
	}

	@Then("^user should be able to see Findowners_text on page$")
	public void f_user_should_be_able_to_see_Findowners_text_on_page() {
		driver.findElement(By.xpath("//*[contains(text(),'Find Owners')]"));
				

	}

	@Given("^on Find owners page$")
	public void g_on_Find_owners_page() {
		System.out.println("Find Owners");
	}
	
	@Test
	@When("^I click on Addowner_button$")
	public void h_i_click_on_Addowner_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		Thread.sleep(5000);


	   
	}
	
	@Test
	@Then("^user should be able to see NewOwner_text on page$")
	public void j_i_user_should_be_able_to_see_NewOwner_text_on_page() {
		
		driver.findElement(By.xpath("//*[contains(text(),'New  Owner')]"));
		System.out.println("New  Owner");
	 
	}
	@Test
	@Given("^on NewOwner page$")
	public void k_on_NewOwner_page() {
		
		System.out.println("New  Owner");
	}

	@Test
	@When("^I enter \"([^\"]*)\" on firstname_textbox$")
	public void l_i_enter_on_firstname_textbox() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
	  
		Thread.sleep(5000);
	}
	@Test

	@When("^I enter \"([^\"]*)\" on lastname_textbox$")
	public void m_i_enter_on_lastname_textbox() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("test2");
		
		Thread.sleep(5000);
	}
	@Test
	@When("^I enter \"([^\"]*)\" on Address_textbox$")
	public void n_i_enter_on_Address_textbox() throws InterruptedException {
	   
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("kondapur flat 200");
		
		Thread.sleep(5000);
	}
	@Test
	@When("^I enter \"([^\"]*)\" on city_textbox$")
	public void o_i_enter_on_city_textbox() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("hyderaba");
		Thread.sleep(5000);
	}
	@Test
	@When("^I enter \"([^\"]*)\" on telephone_textbox$")
	public void p_i_enter_on_telephone_textbox() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("7032910508");
		
		Thread.sleep(5000);
	  
	}
	@Test
	@When("^I click on AddOwner_button$")
	public void q_i_click_on_AddOwner_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(5000);
		
	}

	@Test
	@Then("^user should be able to see OwnerInformation_text on page$")
	public void r_user_should_be_able_to_see_OwnerInformation_text_on_page() {
	   
		
		driver.findElement(By.xpath("//*[contains(text(),'Owner Information')]"));
		
		System.out.println("Owner Information");
		
	}
	
	
	
	
	@Given("^on OwnerInformation_page$")
	public void s_on_OwnerInformation_page() throws Throwable {
	driver.findElement(By.xpath("//*[contains(text(),'Owner Information')]"));
		
		System.out.println("Owner Information");
	 
	}
	@Test
	@When("^I clicked on Findowners_link$")
	public void t_i_clicked_on_Findowners_link() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(),'Find owners')]")).click();  
		Thread.sleep(5000);
	}
	@Test
	@When("^I click on  FindOwner_button$")
	public void u_i_click_on_FindOwner_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("test");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();  
		Thread.sleep(5000);
	   
	}
	@Then("^user should be able to see Owners information on page$")
	public void v_user_should_be_able_to_see_Owners_information_on_page() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(),'Owners')]"));
		Thread.sleep(5000);
	}



	
	@Test
	public void w_afterScenario() 
	{
	     driver.quit();
	}

}
