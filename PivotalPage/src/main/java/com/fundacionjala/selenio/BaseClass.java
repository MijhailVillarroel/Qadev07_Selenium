package com.fundacionjala.selenio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public abstract class BaseClass {

    protected WebDriver driver;

    private static final int TIMEOUT_NORMAL = 15;

    public BaseClass() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT_NORMAL, TimeUnit.SECONDS);
    }
}



