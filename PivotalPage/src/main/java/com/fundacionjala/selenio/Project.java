package com.fundacionjala.selenio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class Project extends BaseClass {

    @FindBy(css = ".raw_context_name.public")
    private WebElement nameProjectText;

    @FindBy(css = "[data-aid='navTab-settings']")
    private WebElement settingButton;

    public String getNameProjectTest() {
        return nameProjectText.getText();
    }

    public ProjectEdit clickSettingMenu() {
        settingButton.click();
        return new ProjectEdit();
    }
}
