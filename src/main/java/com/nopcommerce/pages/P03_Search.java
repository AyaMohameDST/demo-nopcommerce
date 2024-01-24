package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Search extends BaseConfig {
    By inPutInSearch = By.id("small-searchterms");
    By searchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By list = By.cssSelector("ul[id=\"ui-id-1\"]");



    public String currantUrl (){

        return driver.getCurrentUrl();
    }
    public WebElement inPutInSearch () {

        return driver.findElement(inPutInSearch);
    }

    public WebElement searchButton () {

        return  driver.findElement(searchButton);
    }
    public List<WebElement> list (){
        return driver.findElements(list);
    }








}
