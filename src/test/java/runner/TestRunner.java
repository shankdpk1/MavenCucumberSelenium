package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
//        features="features",
//        features="C:\\Users\\shash\\Maven\\MavenCucumberSelenium\\Features\\googleSearch.feature",
        features={"C:\\Users\\shash\\Maven\\MavenCucumberSelenium\\Features\\googleSearch.feature","C:\\Users\\shash\\Maven\\MavenCucumberSelenium\\Features\\googleSearch2.feature"},
        glue="stepDefinition",
        dryRun = false,
        monochrome = true,
        plugin= {"pretty","html:target/cucumber-html-report"},

        tags={"@regression"}
)

public class TestRunner {

		
}
