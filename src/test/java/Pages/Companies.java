package Pages;

import Helpers.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Companies {

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/span[1]")
    WebElement groomers;





    DriverHelper driverHelper;

    WebDriver driver;



    /*private void validsafe() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/products-services/akc-safe-grooming-program/"));

    }*/
    /*Initialize Companies*/
    public Companies(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }




}
