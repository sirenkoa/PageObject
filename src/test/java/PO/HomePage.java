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

    public boolean checkDayCoursesArePresent() {

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
                return false;
            }
        }
        return true;
    }
    public boolean checkNightCoursesArePresent() {

        String arr[] = {
                "Тестування",
                "Frontend development",
                "JS development",
                "Веб-дизайн",
                "PHP",
                "Програмування під IOS",
                "Програмування під Android",
                "Java programming",
                "Python",
                "Data Science/Machine Learning",
                "C# /.NET development",
                "C++",
                "Game Development",
                "DEVOPS",
                "Маленький інтелектуал",
                "Курси створення сайтів для дітей",
                "Digital Marketing",
                "Управління персоналом",
                "Управління проектами",
                "Менеджмент",
                "Кібербезпека",
                "Відеомонтаж",
                "Cisco"
        };
        List<String> courses = Arrays.asList(arr);
        List<WebElement> list = driver.findElements(By.xpath("//h2"));
        for (WebElement el : list) {
            if (!courses.contains(el.getText())) {
                System.out.println(String.format("Expected courses to contain '%s'.", el.getText()));
                return false;
            }
        }
        return true;
    }
    public HomePage Close (){
        driver.quit();
        return this;
    }
}
