package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NightSchool extends BasePage {
    public NightSchool (WebDriver driver){
        super(driver);
    }

    By nightschoolHeader = By.xpath("//h1[contains(text(), 'Вечірні курси')]");

    public NightSchool isShown() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(nightschoolHeader));
        return this;
    }
}
