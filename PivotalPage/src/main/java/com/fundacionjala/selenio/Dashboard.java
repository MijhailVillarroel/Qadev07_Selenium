package com.fundacionjala.selenio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mijhailvillarroel on 6/14/2016.
 */
public class Dashboard extends BaseClass {

    @FindBy(className = "tc_dropdown_name")
    private  WebElement userNameText;

    @FindBy(id = "create_new_project_button")
    private WebElement createProjectLink;

    public CreateProject clickCreateProjectLink() {
        createProjectLink.click();
        return new CreateProject();
    }

    public String getUserNameText() {
        return userNameText.getText();
    }
}
