package pageObjects;

import static common.SysUtil.waitElement;
import config.Enviroment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;
    By btnLogin = By.linkText("LOG IN");
    By lblPrincipal = By.className("m-b-1");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void waitMeinPageLoad(){
        waitElement(driver, lblPrincipal);
    }

    public void goLogin(){
        driver.findElement(btnLogin).click();
    }

}
