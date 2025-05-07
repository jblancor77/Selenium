package Pages;


import Helpers.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Activities {


    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement iconsignin;




    DriverHelper driverHelper;

    WebDriver driver;

    public Activities(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }



}