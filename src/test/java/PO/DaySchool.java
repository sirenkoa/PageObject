package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DaySchool extends BasePage {
    public DaySchool (WebDriver driver){
            super(driver);
        }

        By dayschoolHeader = By.xpath("//h1[contains(text(), 'Денне навчання')]");

        public DaySchool isShown() {
            logger.info("check isShown DaySchool page");

            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dayschoolHeader));
            return this;
        }
}
