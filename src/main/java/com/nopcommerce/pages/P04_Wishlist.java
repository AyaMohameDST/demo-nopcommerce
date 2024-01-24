package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class P04_Wishlist extends BaseConfig {
    By  productSelected = By.cssSelector("div[data-productid=\"18\"]");
    By addToWishlistButton = By.id("add-to-wishlist-button-18");
    By barNotification = By.id("bar-notification");
    By barNotificationColor = By.id("bar-notification");
    By buttonX = By.cssSelector("span[class=\"close\"]");
     By wishlistNumber = By.cssSelector("span[class=\"wishlist-qty\"]");
    By wishlistIcon = By .xpath("//p//a[@href=\"/wishlist\"]");
    By wishlistContain = By.className("product-name");

    public String currantUrl (){

        return driver.getCurrentUrl();
    }
    public WebElement productSelected (){
        return driver.findElement(productSelected);
    }
    public  WebElement addToWishlistButton (){
        return driver.findElement(addToWishlistButton);
    }
    public  Boolean barNotification(){
        return driver.findElement(barNotification).isDisplayed();
    }
    public String barNotificationColor (){
        String rgb = driver.findElement(barNotificationColor).getCssValue("background-color");
        return Color.fromString(rgb).asHex();
    }
    public WebElement buttonX (){

        return driver.findElement(buttonX);
    }
    public String wishlistNumber (){
        return driver.findElement(wishlistNumber).getText();
    }
    public WebElement wishlistIcon (){
        return driver.findElement(wishlistIcon);
    }
    public String wishlistContain (){
        return driver.findElement(wishlistContain).getText();
    }


}

