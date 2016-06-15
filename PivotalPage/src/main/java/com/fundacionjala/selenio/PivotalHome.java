package com.fundacionjala.selenio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by mijhailvillarroel on 6/14/2016.
 */
public class PivotalHome extends BaseClass {

    public static final String PIVOTALTRACKER_URL = "https://www.pivotaltracker.com";

    @FindBy(css = ".btn-login>a")
    private WebElement signInLink;

    public PivotalHome() {
        driver.get(PIVOTALTRACKER_URL);
    }

    public Login clickSingInLink() {
        signInLink.click();
        return new Login();
    }
}
