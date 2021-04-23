package config;

import static common.Data.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config {

    public Config(){}
    /**
     * Mmethod to set the driver with the browser and the URL
     * @param browser
     * @return
     */
    private WebDriver setDriver(String browser, String url){
        WebDriver driver = null;
        if(browser.contains("chrome")){
            WebDriverManager.chromedriver().browserVersion("89.0.4389.90").setup();
            driver = new ChromeDriver();
        }
        if(browser.contains("firefox")){
            WebDriverManager.firefoxdriver().browserVersion("86.0.1").setup();
            driver = new FirefoxDriver();
        }
        driver.manage().deleteAllCookies();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getDriver(String browser, String url){
        return setDriver(browser, url);
    }
}
