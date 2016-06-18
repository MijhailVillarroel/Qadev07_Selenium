package com.fundacionjala.selenio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class DriverManager {

    private static DriverManager instance;

    private WebDriver driver;

    public static final int TIMEOUT_NORMAL = 15;

    private DriverManager() {
        initWebDriver();
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    private void initWebDriver() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT_NORMAL, TimeUnit.SECONDS);
    }
}
