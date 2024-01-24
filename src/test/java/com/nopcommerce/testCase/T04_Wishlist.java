package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.config.BaseConfig;
import com.nopcommerce.pages.P04_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T04_Wishlist extends BaseTest  {
    P04_Wishlist wishlist = new P04_Wishlist();

    @Test()
    public void addProductToWishlist() throws InterruptedException {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "addProductToWishlist");
        test.log(Status.INFO, "starting");
        test.assignCategory("T04");
        Assert.assertEquals(wishlist.currantUrl(), "https://demo.nopcommerce.com/");
        new Actions(driver).moveToElement(wishlist.productSelected()).click().perform();
        wishlist.addToWishlistButton().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(wishlist.barNotification());
        softAssert.assertTrue(wishlist.barNotificationColor().contains("#e4434b\n"));
        wishlist.buttonX().click();
        Assert.assertTrue(wishlist.wishlistNumber().contains("1"));
        Thread.sleep(10);
        wishlist.wishlistIcon().click();
        Assert.assertTrue(wishlist.wishlistContain().contains("HTC One M8 Android L 5.0 Lollipop"));










    }
}
