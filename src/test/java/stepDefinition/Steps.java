package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pageObjects.GoogleHome;

public class Steps extends BaseClass {


    @Before
    public void config() throws Throwable {

        logger = Logger.getLogger("myProject");
        PropertyConfigurator.configure("Log4j.properties");

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\shash\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        gh = new GoogleHome(driver);

//        System.setProperty("webdriver.ie.driver", "C:\\Users\\shash\\eclipse-workspace\\JarFiles\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
//        gh = new GoogleHome(driver);

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shash\\Downloads\\chromedriver.exe");
//        driver = new ChromeDriver();
//        gh = new GoogleHome(driver);
    }

    @Given("^Launch Browser$")
    public void Launch_Browser() throws Throwable {

        logger.info("---- launching browser");
        gh = new GoogleHome(driver);
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

	@After
    public void after(){

        driver.quit();
    }

}
