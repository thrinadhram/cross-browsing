package com.annotations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
    WebDriver driver;

    @Test
    void homepagetitle() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        // driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
}}
