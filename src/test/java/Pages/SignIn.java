package Pages;

import Helpers.DataHelper;
import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {


    @FindBy(id = "Email")
    WebElement userName;


    @FindBy(id = "Password")
    WebElement password;


    @FindBy(xpath = "//*[@id='login-screen']/div[2]/form/input[5]")
    WebElement ingresar;







    WebDriver driver;
    DataHelper dataHelper;
    private WebElement logodragones;


    /*Initialize WebDriver*/
    public SignIn(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    /*Check SignIn*/
    public void signInUser(User _testUser) {


        this.userName.sendKeys(_testUser.username);
        this.password.sendKeys(_testUser.password);
        this.ingresar.click();
        //this.logged.isDisplayed();
        // Actions action = new Actions(this.driver);
        // action.moveToElement(logged).perform();
        // action.moveToElement(logged).click();


    }





}
