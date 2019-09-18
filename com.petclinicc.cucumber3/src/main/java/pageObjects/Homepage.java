package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
	
	public class Homepage {
		WebDriver driver;
		
		public Homepage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void perform_Search(String search) {
			driver.navigate().to("http://ec2-18-224-214-236.us-east-2.compute.amazonaws.com:8080/petclinic/");
		}
		
		public void navigateTo_HomePage() {
			driver.get("http://ec2-18-224-214-236.us-east-2.compute.amazonaws.com:8080/petclinic/");
}
}
	