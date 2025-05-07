package Pages;


import Helpers.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {

    @FindBy(xpath = "//*[@id='accordionSidebar']/a/div[2]/img")
    WebElement logodragones;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[1]/a/span")
    WebElement companies;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[2]/a/span")
    WebElement individuals;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[3]/a/span")
    WebElement activities;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[4]/a/span")
    WebElement notes;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[4]/a/span")
    WebElement routes;

    @FindBy(xpath = "//*[@id='userDropdown']/span[1]")
    WebElement account;

    @FindBy(xpath = "//*[@id='content']/nav/ul/li[2]/div/a[4]")
    WebElement logout;


    DriverHelper driverHelper;

    WebDriver driver;

    /*Initialize WebDriver*/
    public Homepage(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }
    /*Check Menu redirection pages*/
    /*private void valid1() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/"));

    }*/




    /*Check  homepage elements*/
    public void CheckHomepage()  {

        //WebDriverWait wait = new WebDriverWait (driver, 10);
        this.logodragones.isDisplayed();
        this.companies.isDisplayed();
        this.individuals.isDisplayed();
        this.activities.isDisplayed();
        this.notes.isDisplayed();
        this.routes.isDisplayed();
        this.account.click();
        this.logout.click();

    }





}


















