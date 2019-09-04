package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  // libraries

@Cucumber.Options(features = "src/test/resources",tags = {"@CreateAbstarct" }, plugin = { "pretty", "html:taget/cucumber-html-repoty","json:target/cucumber.json","junit:target/cucumber.xml","rerun:target/rerun.txt" }, glue = {"com.AbstarctSubmission"}) 



public class Testrunner {

}
