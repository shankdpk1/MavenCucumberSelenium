package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.GoogleHome;
import io.qameta.allure.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Steps extends BaseClass {


//    @Before
//    public void config() throws Throwable {
//
//        System.out.println("== Temp code to parametrized maven command and consume value here ==================");
////        here chrome is default value for browser if nothing passed from command line for myBrowser variable
//        String browser = System.getProperty("browser", "edge");
//        String env = System.getProperty("myEnv", "qa1");
//        System.out.println(browser);
//        System.out.println(env);
//
////        cmd to run is ->    mvn test -DmyBrowser=chrome -DmyEnv=QA07
//        System.out.println("=========================");
//
//
//        logger = Logger.getLogger("myProject");
//        PropertyConfigurator.configure("Log4j.properties");
//
//        if (browser.equals("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\shash\\Downloads\\geckodriver.exe");
//            driver = new FirefoxDriver();
//            gh = new GoogleHome(driver);
//        } else if (browser.equals("ie")) {
//            System.setProperty("webdriver.ie.driver", "C:\\Users\\shash\\eclipse-workspace\\JarFiles\\IEDriverServer.exe");
//            driver = new InternetExplorerDriver();
//            gh = new GoogleHome(driver);
//        } else if (browser.equals("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\shash\\Downloads\\chromedriver.exe");
//            driver = new ChromeDriver();
//            gh = new GoogleHome(driver);
//        } else if (browser.equals("edge")) {
//            System.setProperty("webdriver.edge.driver", "C:\\Users\\shash\\eclipse-workspace\\JarFiles\\msedgedriver.exe");
//            driver = new EdgeDriver();
//            gh = new GoogleHome(driver);
//        }
//    }

    @Given("^Launch Browser$")
    public void Launch_Browser() throws Throwable {

        logger.info("---- launching browser");
        gh = new GoogleHome(driver);



        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "102.0");
        options.setCapability("selenoid:options", new HashMap() {{
            /* How to add test badge */
            put("name", "Test badge...");

            /* How to set session timeout */
            put("sessionTimeout", "15m");

            /* How to set timezone */
            put("env", new ArrayList() {{
                add("TZ=UTC");
            }});

            /* How to add "trash" button */
            put("labels", new HashMap<String, Object>() {{
                put("manual", "true");
            }});

            /* How to enable video recording */
            put("enableVideo", true);
        }});
//        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);


    }

    @Then("^Google is open$")
    public void Google_is_open() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shash\\eclipse-workspace\\JarFiles\\chromedriver.exe");

        logger.info("---- launching google");

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();


    }

    @When("^Searching Selenium$")
    public void Searching_Selenium() throws Throwable {
	System.out.println("page title is "+driver.getTitle());
	    System.out.println("master");

	gh.enterSearchingData("Selenium");
    Thread.sleep(500);
	gh.submitSearch();
	Thread.sleep(1000);

    }

    @Then("^Selenium is searched successfully$")
    public void Selenium_is_searched_successfully() throws Throwable {
    System.out.println("page title is "+driver.getTitle());

    logger.info("---- searched data");


	}


	//parameterization
	@When("^Searching \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void searching(String fName, String mName, String lName) throws Throwable {
		System.out.println("page title is "+driver.getTitle());

        gh.enterSearchingData(fName+" "+mName+" "+lName);
		Thread.sleep(500);

		gh.submitSearch();
        Thread.sleep(1000);
    }

//	@After
//    public void after(Scenario scenario){
//
//        driver.quit();
//
//        if (scenario.isFailed()) {
//            System.out.println("failed, take screenshot");
//        }
//
//
//        System.out.println("Printing Scenario details in After hook - START");
//        System.out.println(scenario.getName());
//        System.out.println(scenario.getId());
//        System.out.println(scenario.isFailed());
//        System.out.println("Printing Scenario details in After hook - END");
//    }

    @Then("Fail Test")
    public void failTest() {
        assert false;

//        System.out.println("failed, take screenshot");

    }

    @Given("print msg")
    public void printMsg() {
        System.out.println("hi");
    }

    @Then("go check")
    public void gocheck() {
        System.out.println("hqi");
    }
}
