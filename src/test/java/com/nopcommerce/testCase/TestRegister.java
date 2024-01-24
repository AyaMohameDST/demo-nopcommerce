package com.nopcommerce.testCase;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static com.nopcommerce.config.BaseConfig.extent;

public class TestRegister extends BaseTest {


    P01_Register register = new P01_Register();

    @Test()
    public void   registerWithValidData(){

        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "registerWithValidData");
        test.log(Status.INFO, "starting");
        test.assignCategory("P0");

        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        register.registerButton().click();
        register.genderMale().click();
        register.firstName().sendKeys("aya");
        register.lastName().sendKeys("elkady");
        Select selectFromDropDownMenuDay = new Select(register.selectFromDropDownMenuDay());
        selectFromDropDownMenuDay.selectByValue("18");
        Select selectFromDropDownMenuMonth = new Select(register.selectFromDropDownMenuMonth());
        selectFromDropDownMenuMonth.selectByValue("8");
        Select selectFromDropDownMenuYear = new Select(register.selectFromDropDownMenuYear());
        selectFromDropDownMenuYear.selectByValue("2000");
        register.email().sendKeys("a28.maoh4amed18@gmail.com");
        register.password().sendKeys("AYA1223@#");
        register.confirmPassword().sendKeys("AYA1223@#");
        register.register().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(register.registerMsgText().contains("Your registration completed"));
        softAssert.assertTrue(register.rgbColor().contains("#4cb17c"));

       }


    }





