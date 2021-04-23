package config;

import static common.Data.BROWSER;
import static common.Data.URL;
import static common.SysUtil.getTestData;
import static common.SysUtil.setLogFile;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;

import java.util.logging.Logger;

public class Enviroment extends BaseDriver{

    public BaseDriver driver;
    public Logger log;

    public Enviroment(BaseDriver driver){ this.driver = driver; }

    /**
     * Method to configure the environment
     */
    @Before
    public void setEnvironment(){
        JSONObject jsonObject = getTestData();
        Config config = new Config();
        this.driver.driver = config.getDriver((String) jsonObject.get(BROWSER), (String) jsonObject.get(URL));

    }

    @BeforeStep
    public void setDataTest(){

    }

    /**
     * Method to close the driver no matter what browser
     */
    @After
    public void closeDriver(){
        this.driver.driver.close();
    }
}
