package pageObjects.Sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSection {

    WebDriver driver;

    public ProductSection(WebDriver driver){ this.driver = driver; }

    By listProductContainer = By.xpath("//*[@class='ui three stackable cards']");
    By listPorducts = By.xpath("//*[@class='ProductCard2 ui card']");

}
