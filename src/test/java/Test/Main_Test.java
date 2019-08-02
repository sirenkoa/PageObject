package Test;


import PO.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Main_Test extends TestBaseSetup {
    HomePage homePage;
    NightSchool nightSchool;
    DaySchool daySchool;
    Logger loggerTest = LogManager.getLogger(Main_Test.class);

    @BeforeMethod
    public void init2() {
        homePage = new HomePage(driver);
        nightSchool = new NightSchool(driver);
        daySchool = new DaySchool(driver);

    }

    @Test()
    public void TEST_Night () {


        loggerTest.debug("Start test_night");


        homePage.isShown().selectLanguage()
                .openNightScholl();
        nightSchool.isShown();
        boolean isPresent = homePage.checkNightCoursesArePresent();
        assertTrue(isPresent);

    }

    @Test
    public void TEST_Day () {
        loggerTest.debug("Start test_day");
        homePage.isShown().selectLanguage()
                .openDaySchool();
        daySchool.isShown();
        boolean isPresent = homePage.checkDayCoursesArePresent();
        assertTrue(isPresent);

    }

}
