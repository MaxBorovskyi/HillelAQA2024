package org.example.hw12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class GetExtraCourses {
    public static void main(String[] args) throws InterruptedException {
        RemoteWebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        browser.manage().window().maximize();
        ItHillelTestingCoursesPage itHillelTestingCoursesPage = new ItHillelTestingCoursesPage(browser);
        itHillelTestingCoursesPage.openTestingURL();

        String istqbCourseText = itHillelTestingCoursesPage.getISTQBBasicCourseText();
        System.out.println("ISTQB advanced extra course is: " + istqbCourseText);
        System.out.println("and");
        String istqbAdvancedCourseText = itHillelTestingCoursesPage.getISTQBAdvancedCourseText();
        System.out.println("ISTQB advanced extra course is: " + istqbAdvancedCourseText);
        browser.quit();
    }

    public static WebDriver getDriver(String browserType) {
        switch (browserType) {
            case "chrome":
                return new ChromeDriver();
            default:
                throw new IllegalArgumentException("Invalid browser type: " + browserType);
        }
    }
}
