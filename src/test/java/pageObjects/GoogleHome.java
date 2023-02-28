package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class GoogleHome {

    public WebDriver ldriver;
    WaitHelper wh;

    public GoogleHome(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

        wh = new WaitHelper(ldriver);

    }

//    public WebDriver driver;
//
//    public GoogleHome(WebDriver driver){
//        this.driver = driver;
//
//    }

    @FindBy(xpath = "//input[@name='q']")
    @CacheLookup
    WebElement googleSearchBar;


//    @FindBy(how = How.XPATH, using = "//input[@name='q']")
//    @CacheLookup
//    WebElement googleSearchBar1;


    public void enterSearchingData(String input){
        googleSearchBar.sendKeys(input);
    }

    public void submitSearch(){

        wh.waitForEle(googleSearchBar, 1000);
        googleSearchBar.sendKeys(Keys.ENTER);
    }

}
