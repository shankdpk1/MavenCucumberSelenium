package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    WebDriver driver;

    public WaitHelper(WebDriver driver){
        this.driver = driver;
    }


    public void waitForEle (WebElement ele, long timeOutSec){

        WebDriverWait wait = new WebDriverWait(driver, timeOutSec);
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

}
