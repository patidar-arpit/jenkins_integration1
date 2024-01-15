package com.acts.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
    // get webdriver instance
    public static WebDriver getWebDriver() {
        // System.setProperty("webdriver.chrome.driver",
        // "/home/nishant/.cache/selenium/chromedriver/linux64/120.0.6099.109/chromedriver");
        // ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.addArguments("--disable-dev-shm-usage");
        // // chromeOptions.addArguments("--headless");
        // chromeOptions.addArguments("--disable-gpu");
        // chromeOptions.addArguments("--no-sandbox");
        // WebDriver driver = new ChromeDriver(chromeOptions);
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    // checkbox
    public static void selectCheckBox(WebDriver driver, By locator, String value) {
        List<WebElement> checkBoxes = driver.findElements(locator);

        for (WebElement checkBox : checkBoxes) {
            if (checkBox.getAttribute("id").equalsIgnoreCase(value)) {
                checkBox.click();
            }
        }
    }

    // radio button
    public static void selectRadioButton(WebDriver driver, By locator, String value) {
        List<WebElement> radios = driver.findElements(locator);

        for (WebElement radio : radios) {
            if (radio.getAttribute("value").equalsIgnoreCase(value)) {
                radio.click();
                break;
            }
        }
    }

    // select by value
    public static void selectSelectByValue(WebDriver driver, By locator, String value) {
        WebElement menu = driver.findElement(locator);

        Select select = new Select(menu);

        List<WebElement> options = select.getOptions();

        for (WebElement webElement : options) {
            if (webElement.getAttribute("value").equalsIgnoreCase(value)) {
                select.selectByValue(value);
            }
        }
    }

    // select by text
    public static void selectSelectByText(WebDriver driver, By locator, String text) {
        WebElement menu = driver.findElement(locator);

        Select select = new Select(menu);

        List<WebElement> options = select.getOptions();

        for (WebElement webElement : options) {
            if (webElement.getText().equalsIgnoreCase(text)) {
                select.selectByVisibleText(text);
            }
        }
    }

    // verify table cell data
    public static void verifyTableCellData(WebDriver driver, By locator, String text) {
    }

    // verify table row data
    public static void verifyTableRowData(WebDriver driver, By locator, String text) {
    }

}
