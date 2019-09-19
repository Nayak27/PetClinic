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
			driver.navigate().to("http://192.168.1.100:8090/petclinic/");
		}
		
		public void navigateTo_HomePage() {
			driver.get("http://192.168.1.100:8090/petclinic/");
}
}
	