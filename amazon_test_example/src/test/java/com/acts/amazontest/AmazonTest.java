package com.acts.amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acts.utils.Utils;

public class AmazonTest {
    private WebDriver driver;

    String url = "http://amazon.in";

    @BeforeClass
    public void setUp() {
        driver = Utils.getWebDriver();
    }

    @Test(priority = 0)
    public void verifyAmazonPageTittle() throws InterruptedException {

        driver.get(url);

        // Mazimize current window
        driver.manage().window().maximize();

        // Delay execution for 5 seconds to view the maximize operation
        Thread.sleep(2000);

        // driver.navigate().to(url);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }

    @Test(priority = 1)
    public void verifySearchTextBox() throws InterruptedException {

        WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));

        textBox.sendKeys("shirt");

        WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
        searchBtn.click();

        Thread.sleep(2000);

        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.in : shirt");
    }

    // @Test
    // public void verifyImagesLinkAndNavigateBack() throws InterruptedException {

    //     driver.get(url);
    //     driver.manage().window().maximize();

    //     Thread.sleep(2000);

    //     WebElement webElement = driver.findElement(By.linkText("Images"));

    //     webElement.click();

    //     Thread.sleep(3000);

    //     driver.navigate().back();

    //     Thread.sleep(3000);

    //     String url = driver.getCurrentUrl();

    //     Assert.assertEquals(url, "https://www.google.com/");

    // }

    // @Test
    // public void verifyImagesPageLinks() {
    //     List<WebElement> links = driver.findElements(By.tagName("a"));

    //     for (WebElement webElement : links) {
    //         System.out.println(webElement.getText());
    //     }
    // }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}