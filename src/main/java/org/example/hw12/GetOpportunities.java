package org.example.hw12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.List;

public class GetOpportunities {
    public static void main(String[] args) throws InterruptedException {
        RemoteWebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        browser.manage().window().maximize();
        ItHillelTestingCoursesPage itHillelTestingCoursesPage = new ItHillelTestingCoursesPage(browser);
        itHillelTestingCoursesPage.openTestingURL();

        List<WebElement> reasonsToBecomeQA;
        reasonsToBecomeQA = itHillelTestingCoursesPage.getOpportunities();
        for (WebElement reason : reasonsToBecomeQA) {
            System.out.println("Reason to become a QA: " + reason.getText());
        }

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
