package Tests;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.URL;

public class TestDocker {
    WebDriver driver;


    @Test
    public void runTestOnDocker() throws Exception {
        DesiredCapabilities dcap = DesiredCapabilities.chrome();
        String driverPath = System.getProperty("user.dir") + "/exe/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // check the Port No here.
        URL gamelan = new URL("http://localhost:32771/wd/hub");
        WebDriver driver = new RemoteWebDriver(gamelan, dcap);
        // Get URL
        driver.get("https://www.google.com/");
        // Print Title
        System.out.println(driver.getTitle());
    }
}
