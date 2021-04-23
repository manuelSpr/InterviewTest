package pageObjects.Sections;
import static common.SysUtil.waitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductCatalogSection {

    WebDriver driver;

    By lblTitle = By.className("m-t-2");
    By txtSearchProduct = By.xpath("//*[@data-reactid='.0.1.2.0.0.3.1']");

    public ProductCatalogSection(WebDriver driver){ this.driver = driver; }

    public void waitLoadPage(){
        waitElement(driver, lblTitle);
    }

    public void searchProduct(String product){
        driver.findElement(txtSearchProduct).sendKeys(product, Keys.ENTER);
    }
}
