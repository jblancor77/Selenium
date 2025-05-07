package Specs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SpecsBaseClass extends SuperBaseClass {




    /*Selection of Browser or Remote for testing*/
    @BeforeMethod public void InitializeTests(Method method) throws MalformedURLException {

        //driver = getDriver(method.getName());
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        //FirefoxOptions options = new FirefoxOptions ();
        //options.setHeadless(true);
        //driver = new InternetExplorerDriver();
        //driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //InitHelpers("localhost:88/");
        InitHelpers("https://hankev.dragonescrm.com/");
        InitPages();

        driver.get(driverHelper.baseUrl);
        driver.switchTo().defaultContent();
    }

    @AfterMethod public  void CleanUpDriver(){
        driver.switchTo().defaultContent();
        driver.quit();
    }

    /*Define Remote testing parameters*/
    private WebDriver getDriver(String methodName) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("username","jblanco@dragonessoftware.com");
        capabilities.setCapability("accesskey","Jimen@123");
        capabilities.setCapability("name", "Login Form Example");
        capabilities.setCapability("build", "1.0");
        // capabilities.setCapability("browserName", "Internet Explorer");
        //capabilities.setCapability("version", "11");
        //capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("screenResolution", "1280x1024");
        capabilities.setCapability("record_video", "true");
        //capabilities.setCapability("local","true");

        if (methodName.contains("Firefox"))

            capabilities.setCapability("browserName","Firefox");
        else
            //capabilities.setCapability("browserName","Internet Explorer");
            //capabilities.setCapability("version","11");
            capabilities.setCapability("browserName","Firefox");

        capabilities.setCapability("name",methodName);

        URL url = new URL("https://jonathan_6VDhKB:Rpxn9qUN1RWTh7qpBjrn@hub-cloud.browserstack.com/wd/hub");

        RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, capabilities);
        remoteWebDriver.setFileDetector(new LocalFileDetector());
        return remoteWebDriver;
    }

}
