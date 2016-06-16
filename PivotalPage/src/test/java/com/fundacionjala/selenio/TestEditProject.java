package com.fundacionjala.selenio;

import org.junit.Assert;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/16/2016.
 */
public class TestEditProject {
    @Test
    public void testEditProject() {
        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSingInLink();
        login.setUserNameTestField("walter_mercado_jala");
        login.setPasswordTestField("P@ssw0rd");
        Dashboard dashboard = login.clickSignInButton();
        CreateProject createProject = dashboard.clickCreateProjectLink();
        String expectedProjectName = "123458";
        createProject.projectNameTestField(expectedProjectName);
        createProject.clickDisplayListButton();
        createProject.setSelectAccount();
        createProject.setSelectCheckBox();
        Project project = createProject.clickCreateButton();
        ProjectEdit projectEdit = project.clickSettingMenu();
        projectEdit.sendProjectName("test");
        projectEdit.clickSaveEditButtonButton();
        String expectedMessage = "Changes save.";
        assertEquals(expectedMessage,projectEdit.getMessageTest());


    }
}
