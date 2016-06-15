package com.fundacionjala.selenio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class Project extends BaseClass {

    @FindBy(css = ".raw_context_name.public")
    private WebElement nameProjectText;


    public String getNameProjectTest() {
        return nameProjectText.getText();
    }
}
