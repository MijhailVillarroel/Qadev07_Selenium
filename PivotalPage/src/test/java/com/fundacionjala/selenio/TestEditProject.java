package com.fundacionjala.selenio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/16/2016.
 */
public class TestEditProject {

    public static final String USER_NAME = "mija.villa@gmail.com";

    public static final String PASSWORD = "java123456789";

    private Dashboard dashboard;

    private ProjectEdit projectEdit;

    public static final String PROJECT_NAME = "12345103";

    @Before
    public void setUp() {
        dashboard = Login.loginAS(USER_NAME, PASSWORD);
        CreateProject createProject = dashboard.clickCreateProjectLink();
        createProject.projectNameTestField(PROJECT_NAME);
        createProject.setSelectCheckBox();
        Project project = createProject.clickCreateButton();
        projectEdit = project.clickSettingMenu();
    }

    @Test
    public void testEditProject() {
        projectEdit.sendProjectName("test17");
        projectEdit.clickSaveEditButtonButton();
        String expectedMessage = "Changes saved.";
        assertEquals(expectedMessage, projectEdit.getMessageTest());
    }
}
