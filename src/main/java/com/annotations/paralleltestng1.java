package com.annotations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class paralleltestng1 {
    WebDriver driver;
    @Test
    public void title() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertEquals(driver.getTitle(),"HRM");
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        //
    }
}
