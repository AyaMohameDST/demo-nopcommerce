package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class P05_Cart extends BaseConfig {
    By productSelected = By.xpath(
            "(//div[@class=\"item-box\"])[5]");
    By addToCartButton = By.xpath("(//button[@type=\"button\"])[4]");
    By addToCartButtonFromDetailsPage = By.cssSelector("button[id=\"add-to-cart-button-4\"]");
    By  notificationText =By.cssSelector("p[class=\"content\"]");
    By notificationColor = By.cssSelector("p[class=\"content\"]");
    By closeButton  = By.cssSelector("span[class=\"close\"]");
    By shoppingCart = By.xpath("//span[@class=\"cart-qty\"]");
    By buttonGoToCart= By.cssSelector("button[class=\"button-1 cart-button\"]");
    By checkMark = By.cssSelector("input[id=\"termsofservice\"]");
    By checkoutButton = By.cssSelector("button[name=\"checkout\"]");
    By checkoutAsGuest = By.cssSelector("button[class=\"button-1 checkout-as-guest-button\"]");
    By firstName =By.cssSelector("input[id=\"BillingNewAddress_FirstName\"]");
    By lastName = By.cssSelector("input[id=\"BillingNewAddress_LastName\"]");
    By emil = By.cssSelector("input[id=\"BillingNewAddress_Email\"]");
    By city = By.cssSelector("input[id=\"BillingNewAddress_City\"] ");
    By  address1= By.cssSelector("input[id=\"BillingNewAddress_Address1\"]");
    By postalCode = By.cssSelector("input[id=\"BillingNewAddress_ZipPostalCode\"]");
    By phoneNumber = By.cssSelector("input[id=\"BillingNewAddress_PhoneNumber\"]");
    By continueBillingAddress = By.xpath("(//button[@class=\"button-1 new-address-next-step-button\"])[1]");
    By continueShoppingMethod = By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]");
    By continuePaymentMethod = By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]");
    By continuePaymentInformation = By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]");
    By confirmButton = By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]");
    By checkOrder = By.xpath("(//div[@class=\"title\"])[1]");


    public String currantUrl (){

        return driver.getCurrentUrl();
    }
    public WebElement productSelected (){
        return driver.findElement(productSelected);
    }
    public WebElement addToCartButton (){
        return driver.findElement(addToCartButton);

    }

    public WebElement addToCartButtonFromDetailsPage(){
        return driver.findElement(addToCartButtonFromDetailsPage);
    }

     public String notificationText (){
        return driver.findElement(notificationText).getText();
     }
    public String notificationColor (){
        String rgb = driver.findElement(notificationColor).getCssValue("background-color");
        return Color.fromString(rgb).asHex();
    }
    public WebElement closeButton (){
        return driver.findElement(closeButton);
    }
    public String shoppingCart (){

        return driver.findElement(shoppingCart).getText();
    }
    public WebElement buttonGoToCart (){
        return driver.findElement(buttonGoToCart);
    }
    public WebElement checkMark(){
        return driver.findElement(checkMark);
    }
    public WebElement checkoutButton (){
        return driver.findElement(checkoutButton);
    }
    public WebElement checkoutAsGuest (){
        return driver.findElement(checkoutAsGuest);
    }
    public WebElement firstName (){
        return driver.findElement(firstName);
    }
    public WebElement lastName (){
        return driver.findElement(lastName);
    }
    public WebElement email (){
        return driver.findElement(emil);
    }
    public WebElement city (){
        return driver.findElement(city);
    }
    public WebElement address1 (){
        return driver.findElement(address1);
    }
    public WebElement postalCode (){
        return driver.findElement(postalCode);
    }
    public WebElement phoneNumber(){
        return driver.findElement(phoneNumber);
    }
    public WebElement continueBillingAddress(){
        return driver.findElement(continueBillingAddress);
    }
    public WebElement continueShoppingMethod (){
        return driver.findElement(continueShoppingMethod);
    }
    public WebElement continuePaymentMethod (){
        return driver.findElement(continuePaymentMethod);
    }
    public WebElement continuePaymentInformation(){
        return driver.findElement(continuePaymentInformation);
    }
    public WebElement confirmButton (){
        return driver.findElement(confirmButton);
    }
    public  String checkOrder1 () throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(checkOrder).getText();
    }



}

