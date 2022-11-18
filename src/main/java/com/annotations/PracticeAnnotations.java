package com.annotations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeAnnotations {
    WebDriver driver;
    @BeforeClass
    public void launchapp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @Test(priority = 1)
    public void Enterlogindetails(){
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    }
    @Test(priority = 2)
    public void navigatemyinfo()
    {

        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
    }
    @Test(priority = 3)
   public void verifydetails(){
        WebElement element=driver.findElement(By.id("employee-details"));
        System.out.println(element.isDisplayed());
        //driver.quit();
    }
    @AfterClass
  public void details()
  {
       WebElement ele= driver.findElement(By.id("welcome"));
       System.out.println(ele.isDisplayed());
       //driver.quit();
    System.exit(0);
    }
}
