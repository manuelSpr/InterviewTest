package pageObjects.Sections;

import config.Enviroment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WayToStartSection {

    WebDriver driver;
    By btnClose = By.xpath("//*[@viewBox='0 0 16 16']");

    public WayToStartSection(WebDriver driver){
        this.driver = driver;
    }

    public void closeSection(){
        driver.findElement(btnClose).click();
    }

}
