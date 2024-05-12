package org.example.hw12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.List;

public class ItHillelTestingCoursesPage {
    private WebDriver driver;
    private static final String URL = "https://ithillel.ua/courses/testing";
    private static final By ALL_QA_COURSES = By.xpath("//*[@class='profession-bar_title']");

    private static final By ISTQB_BASIC_COURSE = By.xpath("//*[@id='categories']/div[2]/div/ul/li/div/div[3]/ul/li[1]/a/div[2]/p[1]");
    private static final By ISTQB_ADVANCED_COURSE = By.xpath("//*[@id='categories']/div[2]/div/ul/li/div/div[3]/ul/li[2]/a/div[2]/p[1]");
    private static final By WHY_BECOME_QA_REASONS = By.xpath("//*[@class='opportunity-item_title p-l']");
    private static final By PROGRAMMING_CATEGORY = By.xpath("//*[@href='https://ithillel.ua/courses/programming']");
    private static final By MANAGEMENT_CATEGORY = By.xpath("//*[@href='https://ithillel.ua/courses/management']");
    private static final By BUSINESS_TRAINING_CATEGORY = By.xpath("//*[@href='https://ithillel.ua/courses/business-training']");
    private static final By MARKETING_CATEGORY = By.xpath("//*[@href='https://ithillel.ua/courses/marketing']");
    private static final By DESIGN_CATEGORY = By.xpath("//*[@href='https://ithillel.ua/courses/design']");
    private static final By KIDS_12_17_CATEGORY = By.xpath("//*[@href='https://ithillel.ua/courses/kids']");
    private static final By KIDS_7_11_CATEGORY = By.xpath("//*[@href='https://ithillel.ua/courses/kids-7-11']");

    public ItHillelTestingCoursesPage(RemoteWebDriver browser) {
        this.driver = browser;
    }

    public void openTestingURL() {
        driver.get(URL);
    }

    public List<WebElement> getCourses() {
        return driver.findElements(ALL_QA_COURSES);
    }

    public String getISTQBBasicCourseText() {
        WebElement istqbBasicCourse = driver.findElement(ISTQB_BASIC_COURSE);
        return istqbBasicCourse.getText();
    }

    public String getISTQBAdvancedCourseText() {
        WebElement istqbAdvancedCourse = driver.findElement(ISTQB_ADVANCED_COURSE);
        return istqbAdvancedCourse.getText();
    }

    public List<WebElement> getOpportunities() {
        return driver.findElements(WHY_BECOME_QA_REASONS);
    }

    public void goToCategory(String categoryName) throws InterruptedException {
        By categoryXpath;
        switch (categoryName) {
            case "PROGRAMMING": categoryXpath = PROGRAMMING_CATEGORY;
                break;
            case "MANAGEMENT": categoryXpath = MANAGEMENT_CATEGORY;
                break;
            case "BUSINESS TRAINING": categoryXpath = BUSINESS_TRAINING_CATEGORY;
                break;
            case "MARKETING_TRAINING": categoryXpath = MARKETING_CATEGORY;
                break;
            case "DESIGN TRAINING": categoryXpath = DESIGN_CATEGORY;
                break;
            case "KIDS 12-17": categoryXpath = KIDS_12_17_CATEGORY;
                break;
            case "KIDS 7-11": categoryXpath = KIDS_7_11_CATEGORY;
                break;

            default:
                throw new IllegalArgumentException("Invalid category" + categoryName);
        }
        List <WebElement> categoryElements = driver.findElements(categoryXpath);
        for(WebElement categoryElement : categoryElements) {
            categoryElement.click();
            Thread.sleep(3000);
        }
        }
    }


