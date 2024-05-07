package org.example.HW11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class New {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/max/Desktop/work/chromedriver-mac-arm64/chromedriver");
        String browserType = args.length > 0 ? args[0] : "chrome";
        WebDriver browser = getDriver(browserType);
        browser.get("https://ithillel.ua/");
        browser.manage().window().maximize();

        WebElement programmingButton = browser.findElement(By.xpath("//*[@alt='Програмування']"));
        programmingButton.click();

        WebElement frontEndBasicButton = browser.findElement(By.xpath("//div[contains(@class, 'body')][.//img[@src='https://assets.ithillel.ua/images/icons/courses-reach/_transform_icon48_1x/front-end-basic.png']]"));
        frontEndBasicButton.click();
        Thread.sleep(7000);

        WebElement showAllTeachersButton = browser.findElement(By.xpath("//*[@class='coaches_show']"));
        showAllTeachersButton.click();
        Thread.sleep(7000);

        List<WebElement> teacherNames = browser.findElements(By.xpath("//*[@class=\'coach-card_name\']"));
        for (WebElement teacherName : teacherNames) {
            System.out.println("Front-end Basic teachers: " + teacherName.getText());
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
