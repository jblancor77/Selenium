package Specs;

import Helpers.DataHelper;
import Helpers.DriverHelper;
import Pages.*;
import org.openqa.selenium.WebDriver;

public class SuperBaseClass {
    //driver
    WebDriver driver;

    //pages
    SignIn signIn;
    Routes routes;
    Homepage homepage;
    Activities activities;
    Companies companies;
    Individuals individuals;
    Notes notes;





    //helpers
    DataHelper dataHelper;
    DriverHelper driverHelper;


    protected void InitPages(){
        signIn = new SignIn(this.driver);
        homepage = new Homepage(this.driver);
        activities= new Activities(this.driver);
        companies=new Companies(this.driver);
        individuals=new Individuals(this.driver);
        notes=new Notes(this.driver);






    }
    /*Constructor*/
    protected void InitHelpers(String baseUrl){
        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(driver, baseUrl);
    }
}
