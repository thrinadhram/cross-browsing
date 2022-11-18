package com.annotations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class annotation2 {
    WebDriver driver;
    @Test(priority = 1)
    public void launchapp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @Test(priority = 2)
    public void Enterlogindetails(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test(priority = 3)
    public void navigatemyinfo(){
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
    }
    @Test(priority = 4)
    public void verifydetails(){
        WebElement element=driver.findElement(By.id("employee-details"));
        System.out.println(element.isDisplayed());
        driver.quit();
    }
    @Test
    public void details(){
        WebElement ele=driver.findElement(By.id("welcome"));
        System.out.println(ele.isDisplayed());
        System.out.println(ele.getText());
    }
}
