package Pages;

import Helpers.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Individuals {

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[1]/span[1]")
    WebElement listmarket;





    DriverHelper driverHelper;

    WebDriver driver;
    /*Initialize WebDriver*/
    public Individuals(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }






}
