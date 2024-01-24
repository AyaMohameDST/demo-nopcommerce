package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P05_Cart;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T05_Cart extends BaseTest {
    P05_Cart cart = new P05_Cart();
    @Test()
    public void addProductToCartAndThenCheckout () throws InterruptedException {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "addProductToCartAndThenCheckout");
        test.log(Status.INFO, "starting");
        test.assignCategory("T05");
        Assert.assertEquals(cart.currantUrl(), "https://demo.nopcommerce.com/");
        new Actions(driver).moveToElement(cart.productSelected()).perform();
        cart.addToCartButton().click();
        cart.addToCartButtonFromDetailsPage().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(cart.notificationText().contains("The product has been added to your\n"));
        softAssert.assertTrue(cart.notificationColor().contains("#4bb07a"));
        cart.closeButton().click();
        Assert.assertTrue(cart.shoppingCart().contains("2"));
        Actions actions = new Actions(driver);
        WebElement ShoppingCart = driver
                .findElement(By.className("ico-cart"));
        actions.moveToElement(ShoppingCart).perform();
        cart.buttonGoToCart().click();
        cart.checkMark().click();
        cart.checkoutButton().click();
        cart.checkoutAsGuest().click();
        cart.firstName().sendKeys("aya");
        cart.lastName().sendKeys("elkady" );
        cart.email().sendKeys("aya.14@gmail.com");
        Select selectCountryMenu = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        selectCountryMenu.selectByVisibleText("Egypt");
        cart.city().sendKeys("tanta");
        cart.address1().sendKeys("16st");
        cart.postalCode().sendKeys("25632");
        cart.phoneNumber().sendKeys("012222222" );
        cart.continueBillingAddress().click();
        cart.continueShoppingMethod().click();
        cart.continuePaymentMethod().click();
        cart.continuePaymentInformation().click();
        cart.confirmButton().click();
        Assert.assertEquals(cart.checkOrder1(), "Your order has been successfully processed!");




















    }
}
