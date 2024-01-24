package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class P02_Login extends BaseConfig {
    By loginButton = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
    By email = By.className("email");
    By password = By.id("Password");
    By login = By.cssSelector("button[class=\"button-1 login-button\"]");
    By myAccountButton = By.cssSelector("a[class=\"ico-account\"]");
    By logoutButton = By.className("ico-logout");
    By  errorMessage = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
    By errorMessageColor = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");




    public String currantUrl (){
        return driver.getCurrentUrl();
    }
    public WebElement loginButton (){
        return driver.findElement(loginButton);
    }
    public WebElement email (){
        return driver.findElement(email);
    }
    public WebElement password (){
        return driver.findElement(password);
    }
    public WebElement login (){
        return driver.findElement(login);
    }
    public boolean myAccountButton (){

        return driver.findElement(myAccountButton).isDisplayed();
    }
    public boolean logoutButton (){
        return driver.findElement(logoutButton).isDisplayed();
    }
    public  String errorMessage (){

        return driver.findElement(errorMessage).getText();
    }
    public String errorMessageColor (){
        String rgb = driver.findElement(errorMessageColor).getCssValue("color");
        return Color.fromString(rgb).asHex();
    }


}
