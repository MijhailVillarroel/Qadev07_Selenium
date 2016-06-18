package com.fundacionjala.selenio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/14/2016.
 */
public class Dashboard extends BaseClass {

    public static final int TIME_OUT = 5;

    @FindBy(className = "tc_dropdown_name")
    private WebElement userNameText;

    @FindBy(id = "create_new_project_button")
    private WebElement createProjectLink;

    @FindBy(id = "notice")
    private WebElement messageTestDelete;

    public CreateProject clickCreateProjectLink() {
        createProjectLink.click();
        return new CreateProject();
    }

    public String getUserNameText() {
        String userName = "";
        try {
            driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
            userName = userNameText.getText();
        } catch (NoSuchElementException e) {

        } finally {
            driver.manage().timeouts().implicitlyWait(DriverManager.TIMEOUT_NORMAL, TimeUnit.SECONDS);
        }
        return userName;
    }

    public String getMessageTextDelete() {
        return messageTestDelete.getText();
    }
}
