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
public class CreateProject {

    private WebDriver driver;

    @FindBy(css = ".tc_form_input")
    private WebElement projectNameTestField;

    @FindBy(css = ".tc_select_account_name")
    private List <WebElement> accountSelect;

    @FindBy(className = "tc_form_select")
    private WebElement displayListButton;

    @FindBy(xpath = ".//*[@id='modal_area']/div/div/div[2]/div/form/div/footer/button[2]")
    private WebElement createButton;

    @FindBy(css = ".tc_form_label.tc_form_checkbox")
    private List <WebElement> listCheckBox;

    public CreateProject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void projectNameTestField(String projectName) {
        projectNameTestField.clear();
        projectNameTestField.sendKeys(projectName);
    }

    public void setSelectAccount(String nameAccount) {
        List<WebElement> accounts = accountSelect;
        for (WebElement webElement : accounts) {
            String nameValue = webElement.getText();
            if (nameValue.equalsIgnoreCase(nameAccount)){
                webElement.click();
                break;
            }
        }
    }

    public void setSelectCheckBox(String nameCheckBox, boolean enable) {
        WebElement checkBox = getWebElementOFList(nameCheckBox, listCheckBox);
        try {
            if (!checkBox.isSelected() ){
                checkBox.click();
            }
        }catch (Exception e) {
            System.out.println("Unable to select the checkbox");
        }
    }

    public void clickDisplayListButton() {
        displayListButton.click();
    }

    public Project clickCreateButton() {
        createButton.click();
        return new Project (driver);
    }

    private WebElement getWebElementOFList(String nameAccount, List<WebElement> elements) {
        for (WebElement webElement : elements) {
            String nameValue = webElement.getText();
            if (nameValue.equalsIgnoreCase(nameAccount)){
                return webElement;
            }
        }
        return null;
    }
}
