package com.fundacionjala.selenio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class CreateProject extends BaseClass {

    @FindBy(css = ".tc_form_input")
    private WebElement projectNameTestField;

    @FindBy(xpath = ".//*[@id='modal_area']/div/div/div[2]/div/form/div/section/div[2]/div[1]/ul/li[2]/span[1]")
    private WebElement accountSelect;

    @FindBy(className = "tc_form_select")
    private WebElement displayListButton;

    @FindBy(xpath = ".//*[@id='modal_area']/div/div/div[2]/div/form/div/footer/button[2]")
    private WebElement createButton;

    @FindBy(xpath = ".//*[@id='tc_public_project']")
    private WebElement publicCheckBox;

    public void projectNameTestField(String projectName) {
        projectNameTestField.clear();
        projectNameTestField.sendKeys(projectName);
    }

    public void setSelectAccount() {
        if (!accountSelect.isSelected()){
            accountSelect.click();
        }

    }

    public void setSelectCheckBox() {
            if (!publicCheckBox.isSelected()){
                publicCheckBox.click();
            }
    }

    public void clickDisplayListButton() {
        displayListButton.click();
    }

    public Project clickCreateButton() {
        createButton.click();
        return new Project ();
    }
}
