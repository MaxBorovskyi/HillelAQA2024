package org.example.hw12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class GoToProgrammingPage {
    public static void main(String[] args) throws InterruptedException {
        RemoteWebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        browser.manage().window().maximize();
        ItHillelTestingCoursesPage itHillelTestingCoursesPage = new ItHillelTestingCoursesPage(browser);
        itHillelTestingCoursesPage.openTestingURL();

        itHillelTestingCoursesPage.goToCategory("PROGRAMMING");
        itHillelTestingCoursesPage.goToCategory("MANAGEMENT");
        itHillelTestingCoursesPage.goToCategory("BUSINESS TRAINING");
        itHillelTestingCoursesPage.goToCategory("MARKETING_TRAINING");
        itHillelTestingCoursesPage.goToCategory("DESIGN TRAINING");
        itHillelTestingCoursesPage.goToCategory("KIDS 12-17");
        itHillelTestingCoursesPage.goToCategory("KIDS 7-11");

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
