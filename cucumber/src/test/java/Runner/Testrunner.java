package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  // libraries

@Cucumber.Options(format = {"pretty", "html:target/Destination"}) 



public class Testrunner {

}
