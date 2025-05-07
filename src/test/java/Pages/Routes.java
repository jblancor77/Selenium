package Pages;

import Helpers.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Routes {

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement iconsignin;



    DriverHelper driverHelper;

    WebDriver driver;

    // Initalize WebDriver*/
    public Routes(WebDriver _driver, DriverHelper _driveHelper){
        this.driver = _driver;
        this.driverHelper = _driveHelper;
        PageFactory.initElements(driver,this);
    }





}
