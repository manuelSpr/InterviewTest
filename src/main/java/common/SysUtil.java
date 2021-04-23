package common;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import static common.Data.*;

public class SysUtil {

    public SysUtil(){}

    /**
     *
     * @return
     */
    public static Logger setLogFile(){
        Logger log = Logger.getLogger("MyLog");
        FileHandler fh;
        try{
            fh = new FileHandler(PATH_LOG);
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (Exception ex){

        }
        return log;
    }

    /**
     * A general method to wait see any element
     * @param driver
     * @param element
     */
    public static void waitElement(WebDriver driver, By element){
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    private static JSONObject getConfigTest(){
        JSONParser parse = new JSONParser();
        JSONObject jsonObject = new JSONObject();
        try{
            Object obj = parse.parse(new FileReader(PATH_DATA_TEST));
            jsonObject =  (JSONObject) obj;
        } catch (ParseException ex){
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return jsonObject;
    }

    public static JSONObject getTestData(){
        return getConfigTest();
    }

}
