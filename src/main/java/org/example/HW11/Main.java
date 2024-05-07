package org.example.HW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/max/Desktop/work/chromedriver-mac-arm64/chromedriver");
        WebDriver browser = getDriver(args[0]);
        browser.get("https://ithillel.ua/");
        Thread.sleep(3000);

        browser.manage().window().maximize();

        System.out.println(browser.getTitle());
        Thread.sleep(10000);
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