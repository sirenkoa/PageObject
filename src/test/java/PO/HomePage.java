package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver){
            super(driver);
        }

    By nightschoolBtn = By.id("menu-item-7870");
    By nightcourses = By.id("menu-item-7871");
    By dayschoolBtn =By.id("menu-item-7956");
    By daycourses = By.id("menu-item-7885");
    By languge = By.xpath("(//a[text()='UA'])[1]");








    public HomePage isShown() {
       logger.info("Open home page");

        driver.manage().window().maximize();
        driver.get("http://iteaua-develop.demo.gns-it.com/");


        return this;
    }

    public HomePage selectLanguage () {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(languge));
        driver.findElement(languge).click();
        return this;

    }

    public HomePage openNightScholl() {
       logger.info("open Night Scholl Page");

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(nightschoolBtn));
        driver.findElement(nightschoolBtn).click();
        wait.until(ExpectedConditions.elementToBeClickable(nightcourses));
        driver.findElement(nightcourses).click();

        return this;
    }
    public HomePage openDaySchool (){
       logger.info("open Day School Page");

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dayschoolBtn));
        driver.findElement(dayschoolBtn).click();
        wait.until(ExpectedConditions.elementToBeClickable(daycourses));
        driver.findElement(daycourses).click();
        return this;

    }

    public boolean checkDayCoursesArePresent() {
       logger.info("check day courses");

        String arr[] = {
                "Microsoft",
                "Cisco",
                "UNIX / Linux",
                "Oracle",
                "ITIL",
                "Програмування",
                "Управління проектами",
                "Курси для користувачів",
                "Vmware",
                "Teradata",
                "EC-Council"
        };
        List<String> courses = Arrays.asList(arr);
        List<WebElement> list = driver.findElements(By.xpath("//h2"));
        for(WebElement el: list) {
            if(!courses.contains(el.getText())){
                System.out.println(String.format("Expected courses to contain '%s'.", el.getText()));
                logger.error("courses in the database do not match courses on the site");
                return false;
            }
        }
        return true;
    }
    public boolean checkNightCoursesArePresent() {
       logger.info("check night courses ");

        String arr[] = {
                "Тестування",
                "Frontend development",
                "JS development",
                "Веб-дизайн",
                "PHP",
                "Java programming",
                "Python",
                "Data Science/Machine Learning",
                "C# /.NET development",
                "C++",
                "Game Development",
                "DEVOPS",
                "Digital Marketing",
                "Управління персоналом",
                "Управління проектами",
                "Mobile development",
                "Відеомонтаж",
                "Cisco",
                "Go development",
                //"Кібербезпека",
                "Менеджмент"


        };
        List<String> courses = Arrays.asList(arr);
        List<WebElement> list = driver.findElements(By.xpath("//h2"));
        for (WebElement el : list) {
            if (!courses.contains(el.getText())) {
                System.out.println(String.format("Expected courses to contain '%s'.", el.getText()));
                logger.error("courses in the database do not match courses on the site");
                return false;
            }
        }
        return true;
    }
    public HomePage Close (){
        logger.warn("Close webBrowser");


        driver.quit();
        return this;
    }
}
