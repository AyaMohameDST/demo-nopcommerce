package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class P01_Register extends BaseConfig {

    By registerButton = By.xpath("//li//a[@href=\"/register?returnUrl=%2F\"]");
    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By selectFromDropDownMenuDay= By.cssSelector("select[name=\"DateOfBirthDay\"]");
    By selectFromDropDownMenuMonth = By.cssSelector("select[name=\"DateOfBirthMonth\"]");
    By selectFromDropDownMenuYear = By.cssSelector("select[name=\"DateOfBirthYear\"]");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By register= By.id("register-button");
    By rgbColor = By.cssSelector("div[class=\"result\"]");
    By registerMsgText = By.cssSelector("div[class=\"result\"]");


    public WebElement registerButton(){
         return driver.findElement(registerButton);

    }
    public  WebElement genderMale (){
         return driver.findElement(genderMale);
    }
    public  WebElement firstName (){
        return driver.findElement(firstName);
    }
    public WebElement lastName () {
        return driver.findElement(lastName);
    }
    public  WebElement email (){
        return driver.findElement(email);
    }
    public  WebElement selectFromDropDownMenuDay (){

        return driver.findElement(selectFromDropDownMenuDay);
    }
    public  WebElement selectFromDropDownMenuMonth (){
        return driver.findElement(selectFromDropDownMenuMonth);
    }
    public  WebElement selectFromDropDownMenuYear (){
        return driver.findElement(selectFromDropDownMenuYear);
    }
    public  WebElement password (){
        return driver.findElement(password);
    }
    public  WebElement confirmPassword (){
        return driver.findElement(confirmPassword);
    }
    public  WebElement register (){
        return driver.findElement(register);
    }
    public String rgbColor () {

      String rgb = driver.findElement(rgbColor).getCssValue("color");
       return Color.fromString(rgb).asHex();

    }
    public String registerMsgText () {
        return driver.findElement(registerMsgText).getText();

    }




}



