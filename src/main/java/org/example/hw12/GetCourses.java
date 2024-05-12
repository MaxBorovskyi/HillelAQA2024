package org.example.hw12;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.List;

public class GetCourses {
    @SneakyThrows
    public static void main(String[] args) throws InterruptedException {
        RemoteWebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        browser.manage().window().maximize();
        ItHillelTestingCoursesPage itHillelTestingCoursesPage = new ItHillelTestingCoursesPage(browser);
        itHillelTestingCoursesPage.openTestingURL();

        List<WebElement> coursesList = itHillelTestingCoursesPage.getCourses();
        for (WebElement course : coursesList) {
            System.out.println("QA courses are: " + course.getText());
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
