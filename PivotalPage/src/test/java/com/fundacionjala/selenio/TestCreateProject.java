package com.fundacionjala.selenio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/15/2016.
 */
public class TestCreateProject {

    public static final String USER_NAME = "mija.villa@gmail.com";
    public static final String PASSWORD = "java123456789";
    private Dashboard dashboard;
    public static final String PROJECT_NAME = "12345103";

    @Before
    public void setUp() {
        dashboard = Login.loginAS(USER_NAME, PASSWORD);
    }

    @Test
    public void testLogin() {

        CreateProject createProject = dashboard.clickCreateProjectLink();
        createProject.projectNameTestField(PROJECT_NAME);
        createProject.clickDisplayListButton();
        createProject.setSelectAccount();
        createProject.setSelectCheckBox();
        Project project = createProject.clickCreateButton();
        assertEquals(PROJECT_NAME, project.getNameProjectTest());
    }
}
