package com.fundacionjala.selenio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class DriverManager {

    private static DriverManager instance;

    private WebDriver driver;

    private static final int TIMEOUT_NORMAL = 15;

    private DriverManager () {
        initWebDriver();
    }

    public static  DriverManager getInstance() {
        if(instance == null){
            instance = new DriverManager();
        }
        return instance;
    }

    public  WebDriver getDriver(){
        return driver;
    }

    private void initWebDriver(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT_NORMAL, TimeUnit.SECONDS);
    }
}
