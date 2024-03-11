package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccountPositiveTest() {
        new PracticeFormPage(driver).hideIframes();
        new PracticeFormPage(driver).enterPersonalData("John", "Billow", "billow@mail.com", "321654987")
                .selectGender("Male")
                .typeOfDate("15 August 1992")
                .addSubjects(new String[]{"Maths", "Chemistry", "English"})
                .selectHobbies(new String[]{"Sports", "Music"})
                .uploadFile("C:/Tools/1.jpg");
    }
}
