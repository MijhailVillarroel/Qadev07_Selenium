package com.fundacionjala.selenio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class ProjectEdit extends  BaseClass{

    @FindBy(id = "project_name")
    private WebElement projectNameTextField;

    @FindBy(id = "project_description")
    private WebElement descriptionNameTextField;

    @FindBy(className = "save_bar__submit")
    private WebElement saveEditButton;

    @FindBy(id = "delete_link")
    private WebElement linkDelete;

    @FindBy(css = ".message")
    private WebElement testMessage;

    @FindBy(id = "confirm_delete")
    private WebElement deleteProjectButton;

    public void sendProjectName(String nameProject) {
        projectNameTextField.clear();
        projectNameTextField.sendKeys(nameProject);
    }

    public void sendDescriptionName(String descriptionProject) {
        projectNameTextField.clear();
        projectNameTextField.sendKeys(descriptionProject);
    }

    public void clickSaveEditButtonButton() {
        saveEditButton.click();
    }

    public void clickLinkDeleteProject() {
        linkDelete.click();
    }

    public void clickDeleteProjectButton() {
        deleteProjectButton.click();
    }

    public String getMessageTest() {
        return testMessage.getText();
    }
}
