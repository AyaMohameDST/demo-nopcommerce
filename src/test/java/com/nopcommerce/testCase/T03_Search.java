package com.nopcommerce.testCase;
import org.openqa.selenium.WebElement;


import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P03_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

import java.time.Duration;
import org.openqa.selenium.WebElement;


public class T03_Search extends BaseTest {
    P03_Search search = new P03_Search();

    @Test()
    public void searchWithValidData() throws InterruptedException {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "searchWithValidData");
        test.log(Status.INFO, "starting");
        test.assignCategory("T03");
        Assert.assertEquals(search.currantUrl(), "https://demo.nopcommerce.com/");
        search.inPutInSearch().sendKeys("Apple");
        //5. Click on Search
        search.searchButton().click();
        Thread.sleep(2000);
        //a. Verify that all result does not contains Old keyword “Apple”
        //b. Verify that all result contains New Keyword “Card”
        List<WebElement> elements =
                driver.findElements
                        (By.xpath("//h2//a"));
        int elementsCount = elements.size();

        for (int i = 0; i < elementsCount; i++) {
            System.out.println(driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).getText());
            Assert.assertTrue(driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).getText().contains("Apple"));
        }
        search.inPutInSearch().sendKeys("card");
        search.searchButton().click();
        List<WebElement> element =
                driver.findElements
                        (By.xpath("//h2//a"));
        int elementCount = element.size();

        for (int i = 0; i < elementCount; i++) {
            System.out.println(driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).getText());
            Assert.assertFalse(driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).getText().contains("Apple"));
            Assert.assertTrue(driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).getText().contains("Card"));
        }
    }
        @Test()
        public void  viewSuggestionFromSearchWithValidData () {
            String methodName = new Exception().getStackTrace()[0].getMethodName();
            test = extent.createTest(methodName, "viewSuggestionFromSearchWithValidData");
            test.log(Status.INFO, "starting");
            test.assignCategory("T03");
            Assert.assertEquals(search.currantUrl(), "https://demo.nopcommerce.com/");
            search.inPutInSearch().sendKeys("Apple");
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[id=\"ui-id-1\"]")));
            List<WebElement> elements =
                   // search.list();
                    driver.findElements
                            (By.cssSelector("ul[id=\"ui-id-1\"]"));
            int elementsCount = elements.size();

            for (int i = 0; i < elementsCount; i++) {
                System.out.println( driver.findElements(By.cssSelector("ul[id=\"ui-id-1\"]")).get(i).getText());
                Assert.assertFalse(driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).getText().contains("Apple"));

            }
        }

}



