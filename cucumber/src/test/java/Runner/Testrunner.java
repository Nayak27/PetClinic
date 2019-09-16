package Runner;

//import org.junit.runner.RunWith;
//import cucumber.api.SnippetType;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)  // libraries

//@Cucumber.Options(features = "src/test/resources",snippets = SnippetType.CAMELCASE,tags = {"@CreateAbstarct" }, plugin = { "pretty", "html:taget/cucumber-html-repoty","json:target/cucumber.json","junit:target/cucumber.xml","rerun:target/rerun.txt" }, glue = {"com.AbstarctSubmission"}) 
//@CucumberOptions(features= "Feature",glue={"StepDefination"})

package com.techprimers.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.techprimers.testing",
        format = {"json:target/cucumber.json"}
    
)

public class Testrunner {

}
