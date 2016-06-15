package com.fundacionjala.selenio;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class TestCreateProject {
    @Test
    public void testLogin() {
        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSingInLink();
        login.setUserNameTestField("walter_mercado_jala");
        login.setPasswordTestField("P@ssw0rd");
        Dashboard dashboard = login.clickSignInButton();
        CreateProject createProject = dashboard.clickCreateProjectLink();
        String expectedProjectName = "Testselenio78956";
        createProject.projectNameTestField(expectedProjectName);
        createProject.clickDisplayListButton();
        createProject.setSelectAccount();
        createProject.setSelectCheckBox();
        Project project = createProject.clickCreateButton();
        assertEquals(expectedProjectName,project.getNameProjectTest());
    }
}
