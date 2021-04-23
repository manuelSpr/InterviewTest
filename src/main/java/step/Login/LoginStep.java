package step.Login;
import static functions.Assertions.*;
import config.Enviroment;
import io.cucumber.java.en.Then;
import pageObjects.HomeUserPage;
import config.BaseDriver;

public class LoginStep {

    private BaseDriver baseDriver;
    public LoginStep(BaseDriver driver){ this.baseDriver = driver; }

    @Then("I'am in the home page")
    public void validationHomePage(){
        HomeUserPage homeUserPage = new HomeUserPage(baseDriver.driver);
        homeUserPage.waitPageLoad();
        asserTrue(homeUserPage.validationScreen());
    }

}
