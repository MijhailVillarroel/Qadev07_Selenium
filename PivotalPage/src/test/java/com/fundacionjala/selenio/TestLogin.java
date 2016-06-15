package com.fundacionjala.selenio;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/14/2016.
 */
public class TestLogin {

    @Test
    public void testLogin() {
        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSingInLink();
        login.setUserNameTestField("mija.villa@gmail.com");
        login.setPasswordTestField("java123456789");
        Dashboard dashboard = login.clickSignInButton();
        String expectedUserName = "MIJAVILLA";
        assertEquals(expectedUserName, dashboard.getUserNameText());
    }
}
