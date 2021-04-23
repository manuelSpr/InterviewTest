package pageObjects;
import static common.SysUtil.waitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeUserPage {

    WebDriver driver;
    ////*[@id='app']/div/div[1]/div/a[2]
    By imgHome = By.xpath("//*[@data-reactid='.0.0.0.0.0.0']");
    By btnOrders = By.xpath("//*[@id='app']/a[2]");
    By btnPlaceOrder = By.xpath("//*[@data-reactid='.0.0.0.1.0']");
    By btnShopMasks = By.xpath("//*[@data-reactid='.0.0.0.e.0']");
    ////*[@data-reactid='.0.0.0.4']
    public HomeUserPage(WebDriver driver){ this.driver = driver; }

    public void waitPageLoad(){
        waitElement(driver, imgHome);
    }
    public void selectSection(){
        driver.findElement(btnOrders).click();
    }

    public void goPlaceOrder(){
        driver.findElement(btnPlaceOrder).click();
    }

    public boolean validationScreen(){
        return driver.findElement(btnShopMasks).isDisplayed();
    }

}
