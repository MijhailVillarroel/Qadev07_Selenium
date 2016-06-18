package com.fundacionjala.selenio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class CreateProject extends BaseClass {

    @FindBy(css = ".tc_form_input")
    private WebElement projectNameTestField;

    @FindBy(css = ".tc_select_account_name")
    private WebElement accountSelect;

    @FindBy(className = "tc_form_select")
    private WebElement displayListButton;

    @FindBy(css = ".tc_button.tc_button_submit")
    private WebElement createProjectButton;

    @FindBy(xpath = ".//*[@id='tc_public_project']")
    private WebElement publicCheckBox;

    public void projectNameTestField(String projectName) {
        projectNameTestField.clear();
        projectNameTestField.sendKeys(projectName);
    }

    public void setSelectAccount() {
        if (!accountSelect.isSelected()) {
            accountSelect.click();
        }
    }

    public void setSelectCheckBox() {
        if (!publicCheckBox.isSelected()) {
            publicCheckBox.click();
        }
    }

    public void clickDisplayListButton() {
        displayListButton.click();
    }

    public Project clickCreateButton() {
        createProjectButton.click();
        return new Project();
    }
}
