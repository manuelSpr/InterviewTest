package pageObjects;

import common.SysUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By btnLogin = By.xpath("//button[@type='submit']");
    By txtUser = By.xpath("//*[@placeholder='Email']");
    By txtPass = By.xpath("//*[@placeholder='Password']");
    By lblLogin = By.className("m-b-3");
    By lblMessageError = By.xpath("//span[contains(text(),'Incorrect email or password')]");

    public LoginPage(WebDriver driver){ this.driver = driver; }

    public void waitLoginPageLoad(){
        SysUtil util = new SysUtil();
        util.waitElement(driver, lblLogin);
    }

    public void setUser(String user){
        driver.findElement(txtUser).sendKeys(user);
    }

    public void setPass(String pass){
        driver.findElement(txtPass).sendKeys(pass);
    }

    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }

    public String getErrorMessage(){
        SysUtil util = new SysUtil();
        util.waitElement(driver, lblMessageError);
        return driver.findElement(lblMessageError).getText();
    }
}
