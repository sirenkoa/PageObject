package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver){
            super(driver);
        }

    By nightschoolBtn = By.id("menu-item-7870");
    By nightcourses = By.id("menu-item-7871");
    By dayschoolBtn =By.id("menu-item-7956");
    By daycourses = By.id("menu-item-7885");


    public HomePage isShown() {
        driver.manage().window().maximize();
        driver.get("http://iteaua-develop.demo.gns-it.com/");


        return this;
    }

    public HomePage openNightScholl() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(nightschoolBtn));
        driver.findElement(nightschoolBtn).click();
        wait.until(ExpectedConditions.elementToBeClickable(nightcourses));
        driver.findElement(nightcourses).click();

        return this;
    }
    public HomePage openDaySchool (){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dayschoolBtn));
        driver.findElement(dayschoolBtn).click();
        wait.until(ExpectedConditions.elementToBeClickable(daycourses));
        driver.findElement(daycourses).click();
        return this;

    }
    public HomePage Close (){
        driver.quit();
        return this;
    }
}
