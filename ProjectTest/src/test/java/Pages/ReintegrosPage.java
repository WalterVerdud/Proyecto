package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReintegrosPage {
    WebDriver driver;

    public void consultaMedica(){

        driver.findElement(By.linkText("Gestiones Online")).click();
        driver.findElement(By.xpath("//*[@id=\"tramites_en_linea\"]/nav/ul/li[1]/img")).click();
    }




}
