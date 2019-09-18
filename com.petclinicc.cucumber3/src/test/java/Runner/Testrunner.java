package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)  // libraries

@CucumberOptions(features= "Feature",glue={"StepDefination"} , tags= {"@Report"})

public class Testrunner {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig("configs/extent-config.xml");
		}
}

