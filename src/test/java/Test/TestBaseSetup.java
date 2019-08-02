package Test;

import PO.HomePage;
import Utils.Screenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseSetup {

    WebDriver driver;
    HomePage homePage;



    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.chrome.driver"
                ,"D:\\MY\\QA ITEA\\QA automation\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);

    }

    @AfterMethod

    public void Finish(ITestResult result) {
        Screenshot screenshot = new Screenshot(driver);
        screenshot.makeScreenShot(result);
        homePage.Close();
    }
}
