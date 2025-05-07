package Helpers;

import org.testng.annotations.DataProvider;

public class DataHelper {

    public DataHelper(){
    }

    /*Define Data resources*/
    @DataProvider(name="ExistingUsers")
    public static Object[][] credentialsExisting0() throws Exception {

       return ExcelHelper.getTableArray("DragonesUsers.xlsx","Sheet1", 2);
    }




}
