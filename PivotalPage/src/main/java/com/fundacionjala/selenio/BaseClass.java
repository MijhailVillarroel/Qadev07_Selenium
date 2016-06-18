package com.fundacionjala.selenio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public abstract class BaseClass {

    protected WebDriver driver;

    public BaseClass() {
        driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
}
