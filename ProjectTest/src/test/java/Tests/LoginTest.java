package Tests;

import Pages.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {


    @BeforeTest
    public void setUp(){


    }



    @Test
    public void runTest() throws Exception {
        //String driverPath = System.getProperty("user.dir") + "src/test/resources/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        // Get URL
        driver.get("https://www.google.com/");
        // Print Title
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();

    }
}
