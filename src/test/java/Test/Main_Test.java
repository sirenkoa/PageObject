package Test;

import PO.DaySchool;
import PO.HomePage;
import PO.NightSchool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main_Test {
    HomePage homePage;
    NightSchool nightSchool;
    DaySchool daySchool;

    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.chrome.driver"
                ,"D:\\MY\\QA ITEA\\QA automation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        homePage = new HomePage(driver);
        nightSchool = new NightSchool(driver);
        daySchool = new DaySchool(driver);

    }

    @Test
    public void TEST_Night () {
        homePage.isShown()
                .openNightScholl();
        nightSchool.isShown();

    }

    @Test
    public void TEST_Day () {
        homePage.isShown()
                .openDaySchool();
        daySchool.isShown();

    }
    @AfterMethod

    public void Finish() {
        homePage.Close();
    }
}
