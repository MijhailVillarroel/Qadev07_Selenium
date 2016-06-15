package com.fundacionjala.selenio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class Project {
    private WebDriver driver;

    @FindBy(css = ".raw_context_name.public")
    private WebElement nameProjectText;

    public Project(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getNameProjectTest() {
        return nameProjectText.getText();
    }
}
