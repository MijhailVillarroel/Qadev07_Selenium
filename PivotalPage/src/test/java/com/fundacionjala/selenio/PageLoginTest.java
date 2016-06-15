package com.fundacionjala.selenio;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by mijhailvillarroel on 6/13/2016.
 */
public class PageLoginTest {

    @Test
    public void titleHomePage(){
        PageLogin pageLogin = new PageLogin();
        String titleHomePage = "Pivotal Tracker - Sign in";
        Assert.assertEquals(pageLogin.nameTitlePageLogin(), titleHomePage);
        pageLogin.closeDriver();
    }

    @Test
    public void loginInPivotalTrack(){
        PageLogin pageLogin = new PageLogin();
        pageLogin.sendKeyUserName("mija.villa@gmail.com");
        pageLogin.sendKeyPassword("java123456789");
        //pageLogin.clickButton();
        Assert.assertTrue(pageLogin.startNameTitlePageLogin());
        pageLogin.closeDriver();
    }


}
