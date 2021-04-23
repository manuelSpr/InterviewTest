package step.Order;

import config.BaseDriver;
import io.cucumber.java.en.And;
import pageObjects.HomeUserPage;
import pageObjects.Sections.ProductCatalogSection;

public class OrderStep {

    private BaseDriver baseDriver;
    public OrderStep(BaseDriver driver){ this.baseDriver = driver; }

    @And("^Make a order of ([^\"]*) size ([^\"]*) and quantity ([^\"]*)$")
    public void makeAnOrder(String product, String size, String quantity){
        HomeUserPage homeUserPage = new HomeUserPage(baseDriver.driver);
        homeUserPage.waitPageLoad();
        homeUserPage.goPlaceOrder();
        ProductCatalogSection productCatalogSection = new ProductCatalogSection(baseDriver.driver);
        productCatalogSection.waitLoadPage();
        productCatalogSection.searchProduct(product);
    }


}
