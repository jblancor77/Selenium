package Specs;

import Helpers.DataHelper;
import Model.*;
import org.testng.annotations.Test;


public class SampleTests extends SpecsBaseClass {



    /*Login User*/
    @Test (dataProvider = "ExistingUsers", dataProviderClass = DataHelper.class)
    public void SuccessfulLogin(String sEmail, String sPassword)  {

        driver.manage().window().maximize();
        User testUser = new User(sEmail, sPassword);
        signIn.signInUser(testUser);
        homepage.CheckHomepage();

    }






}


    





