package com.annotations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
    WebDriver driver;
    @Test(dataProvider ="logintestdata")
    void  Testlogin(String username,String password){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
        driver.quit();
    }
    @DataProvider(name="logintestdata")
   public Object[][]  logindata(){
        Object[][] data=new Object[2][2];
        data[0][0]="admi";
        data[0][1]="123";
        data[1][0]="dmin";
        data[1][1]="test123";
        return data;


   }
}
