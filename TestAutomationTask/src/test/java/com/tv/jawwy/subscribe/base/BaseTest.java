package com.tv.jawwy.subscribe.base;

import com.tv.jawwy.subscribe.Factory.DriveFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void Setup(){
        driver = new DriveFactory().InitializeDriver();
    }
    @AfterMethod
    public void quite(){

        driver.quit();
    }
}
