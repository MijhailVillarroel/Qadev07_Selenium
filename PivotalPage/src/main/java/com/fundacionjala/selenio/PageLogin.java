package com.fundacionjala.selenio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mijhailvillarroel on 6/13/2016.
 */
public class PageLogin {

    private final By credentials_username;

    private final By credentials_password;

    private final By app_signup_submit_button_button;

    public WebDriver driver;


    public PageLogin (){
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.pivotaltracker.com/signin");
        credentials_password = By.id("credentials_password");
        credentials_username =  By.id("credentials_username");
        app_signup_submit_button_button = By.className("app_signup_submit_button_button");
    }

    public void sendKeyPassword(String password){
        WebElement elementPassword = driver.findElement(credentials_password);
        elementPassword.sendKeys(password);
    }

    public void sendKeyUserName(String nameUser){
        WebElement elementUserName = driver.findElement(credentials_username);
        elementUserName.sendKeys(nameUser);
    }

    public void clickButton(){
        driver.findElement(app_signup_submit_button_button).click();
    }

    public String nameTitlePageLogin (){
        return driver.getTitle();
    }

    public boolean startNameTitlePageLogin (){
        return driver.getTitle().startsWith("Dashboard");
    }

    public void closeDriver() {
        driver.close();
    }

}
