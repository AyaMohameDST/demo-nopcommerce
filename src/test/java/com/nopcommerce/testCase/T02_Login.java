package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P02_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T02_Login extends BaseTest {
    P02_Login login = new P02_Login();
    @Test(priority = 2)
    public void   loginWithValidData() {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "loginWithValidData");
        test.log(Status.INFO, "Login");
        test.assignCategory("P2.1");

        Assert.assertEquals(login.currantUrl(), "https://demo.nopcommerce.com/");
        login.loginButton().click();
        login.email().sendKeys("a28.maoh4amed18@gmail.com");
        login.password().sendKeys("AYA1223@#");
        login.login().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login.myAccountButton());
        softAssert.assertTrue(login.logoutButton());
    }
    @Test(priority = 1)
    public void   loginWithInValidData() {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "loginWithInValidData");
        test.log(Status.INFO, "Login");
        test.assignCategory("P2.2");

        Assert.assertEquals(login.currantUrl(), "https://demo.nopcommerce.com/");
        login.loginButton().click();
        login.email().sendKeys("a2.maoh4ad18@gmail.com");
       login.password().sendKeys("AY22003@#");
        login.login().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login.errorMessage().contains("Login was unsuccessful"));
        softAssert.assertTrue(login.errorMessageColor().contains("#e4434b\n"));


    }



    }
