package step;
import config.Enviroment;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import config.BaseDriver;

public class GlobalStep {

    private BaseDriver baseDriver;
    public GlobalStep(BaseDriver driver){ this.baseDriver = driver;}

    @Given("Starting in the initial page")
    public void initialPage(){
        try{
            MainPage mainPage = new MainPage(baseDriver.driver);
            mainPage.waitMeinPageLoad();
        }
        catch (PendingException pe){

        }
    }

    @When("^I make login with user ([^\"]*) and password ([^\"]*)$")
    public void doLogin(String user, String pass){
        try {
            MainPage mainPage = new MainPage(baseDriver.driver);
            mainPage.goLogin();
            LoginPage loginPage = new LoginPage(baseDriver.driver);
            loginPage.waitLoginPageLoad();
            loginPage.setUser(user);
            loginPage.setPass(pass);
            loginPage.clickLogin();
        } catch (PendingException pe){

        }
    }

}
