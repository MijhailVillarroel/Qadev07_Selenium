package com.fundacionjala.selenio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/14/2016.
 */
public class Login extends BaseClass {

    @FindBy(id = "credentials_username")
    private WebElement userNameTestField;

    @FindBy(id = "credentials_password")
    private WebElement passwordTestField;

    @FindBy(className = "app_signup_submit_button_button")
    private WebElement singInButton;

    public void setUserNameTestField(String username) {
        userNameTestField.clear();
        userNameTestField.sendKeys(username);
    }

    public void setPasswordTestField(String password) {
        passwordTestField.clear();
        passwordTestField.sendKeys(password);
    }

    public static Dashboard loginAS(String userName, String password) {
        Dashboard dashboard = new Dashboard();
        if (!dashboard.getUserNameText().equals(userName)) {
            //Dashboard.logout();
            PivotalHome pivotalHome = new PivotalHome();
            Login login = pivotalHome.clickSingInLink();
            login.setUserNameTestField(userName);
            login.setPasswordTestField(password);
            return login.clickSignInButton();
        }
        return dashboard;
    }

    public Dashboard clickSignInButton() {
        singInButton.click();
        return new Dashboard();
    }

    public String nameTitlePageLogin() {
        return driver.getTitle();
    }
}
