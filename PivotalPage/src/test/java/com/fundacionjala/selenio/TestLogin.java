package com.fundacionjala.selenio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/14/2016.
 */
public class TestLogin {

    private Login login;

    @Before
    public void setUp() {
        PivotalHome pivotalHome = new PivotalHome();
        login = pivotalHome.clickSingInLink();
    }

    @Test
    public void testLogin() {
        login.setUserNameTestField("mija.villa@gmail.com");
        login.setPasswordTestField("java123456789");
        Dashboard dashboard = login.clickSignInButton();
        String expectedUserName = "MIJAVILLA";
        assertEquals(expectedUserName, dashboard.getUserNameText());
    }

    @Test
    public void titleHomePage() {
        String expectResultTitleHomePage = "Pivotal Tracker - Sign in";
        Assert.assertEquals(expectResultTitleHomePage, login.nameTitlePageLogin());
    }
}
