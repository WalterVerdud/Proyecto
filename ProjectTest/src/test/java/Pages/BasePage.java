package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
   public WebDriver driver;

    public void abrir(){

        By btnAdvancedLocator = By.id("details-button");
        By linkProceedLocator = By.id("proceed-link");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Walter\\IdeaProjects\\ProjectTest\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Login provisorio de IDM
        driver.get("https://testosde.osde.ar/authswitch.asp?key=CL0UD2020");
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement btnAdvanced = wait.until(ExpectedConditions.visibilityOfElementLocated(btnAdvancedLocator));
        btnAdvanced.click();
        WebElement linkcontinuar = wait.until(ExpectedConditions.visibilityOfElementLocated(linkProceedLocator));
        linkcontinuar.click();
        driver.navigate().refresh();
        //Login clasico
        driver.get("https://testosde.osde.ar/index.html#!homepage.html");

    }

    public void login(String usuario, String password) throws InterruptedException {

        driver.findElement(By.id("btnInitSession")).click();
        Thread.sleep(4000);
        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys(usuario);
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password);
        driver.findElement(By.id("botonIngresar")).click();
    }

}
