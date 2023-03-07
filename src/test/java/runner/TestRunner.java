package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Cucumber.class)
@CucumberOptions
        (
//        features="features",
//        features="C:\\Users\\shash\\Maven\\MavenCucumberSelenium\\Features\\googleSearch2.feature",
//                features={"C:\\Users\\shash\\Maven\\MavenCucumberSelenium\\Features\\googleSearch.feature","C:\\Users\\shash\\Maven\\MavenCucumberSelenium\\Features\\googleSearch2.feature"},

//                features = {"C:\\Users\\shash\\Maven\\MavenCucumberSelenium\\Features"},

                features = {"Features"},
                glue = "stepDefinition",
//        dryRun = true,
//                monochrome = true,
                plugin = {
                        "pretty", "html:target/cucumber-html-report",
                        "json:target/cucumber-reports",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "timeline:test-output-thread/"                     //this gives you timeline of parallel execution in cucumber report

//                tags={"@regression1,@regression11,@regression111"}
//                tags={"@regression111"}
                        "rerun:target/rerun.txt"           //Creates a text file with failed scenarios

                },

                monochrome = true
        )


public class TestRunner {

}
//import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
//import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
//import org.junit.platform.suite.api.ConfigurationParameter;
//import org.junit.platform.suite.api.IncludeEngines;
//import org.junit.platform.suite.api.SelectClasspathResource;
//import org.junit.platform.suite.api.Suite;
//
//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("com.example")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example")
//
//public class TestRunner  {
//
//}