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
                plugin = {"pretty", "html:target/cucumber-html-report",
//                "timeline:test-output-thread/"                     //this gives you timeline of parallel execution in cucumber report

//                tags={"@regression1,@regression11,@regression111"}
//                tags={"@regression111"}
                        "rerun:target/rerun.txt"           //Creates a text file with failed scenarios

                }
        )


public class TestRunner {

}
