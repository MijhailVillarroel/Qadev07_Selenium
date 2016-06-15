package com.fundacionjala.selenio;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class HomePageTest {

    public static final String NAME_USER = "walter_mercado_jala";
    public static final String PASSWORD = "P@ssw0rd";
    public WebDriver driver;

    @Before
    public void startWebDiver(){
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.pivotaltracker.com/signin");
    }

    @Test
    public void titleHomePage(){
        String titleHomePage = "Pivotal Tracker - Sign in";
        Assert.assertEquals(driver.getTitle(), titleHomePage);

    }
    @Test
    public void loginInPivotalTrack(){

        WebElement userName = driver.findElement(By.id("credentials_username"));
        userName.sendKeys(NAME_USER);
        WebElement password = driver.findElement(By.id("credentials_password"));
        password.sendKeys(PASSWORD);
        WebElement BTNLogin = driver.findElement(By.className("app_signup_submit_button_button"));
        BTNLogin.click();
        Assert.assertTrue(driver.getTitle().startsWith("Dashboard"));
      //  driver.close();
    }
    @Test
    public void loginInPivotalReturnNameUser(){

        WebElement elementUserName = driver.findElement(By.id("credentials_username"));
        elementUserName.sendKeys(NAME_USER);
        WebElement elementPassword = driver.findElement(By.id("credentials_password"));
        elementPassword.sendKeys(PASSWORD);
        WebElement BTNLogin = driver.findElement(By.className("app_signup_submit_button_button"));
        BTNLogin.click();
        String nameUserGet = driver.findElement(By.className("tc_dropdown_name")).getText();
        Assert.assertEquals(NAME_USER.toUpperCase(),nameUserGet);

    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
