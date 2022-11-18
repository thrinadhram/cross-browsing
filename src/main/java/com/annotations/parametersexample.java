package com.annotations;
import com.beust.jcommander.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersexample{

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
   public void setup(String browser, String app){

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("");
        }
        driver.get(app);
    }

    @Test(priority = 1)
    void logotest(){
       WebElement element= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(element.isDisplayed(),"logo not matched");

    }
   @Test(priority = 2)
    void homepagetitle(){
        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM",title,"title not matched");
    }
  /*  @Test(priority = 3)
    void teardown(){
        driver.quit();
    }*/
       @Test(priority = 3)
        public void Enterlogindetails(){
            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
            driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
            Assert.assertEquals(driver.getTitle(),"manikanta");

        }
        @Test(priority = 4)
        public void navigatemyinfo()
        {
            driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        }

     /*   @Test(priority = 5)
       public void verifydetails(){
            WebElement element=driver.findElement(By.id("employee-details"));
            Assert.assertTrue(element.isDisplayed());
            //System.out.println(element.isDisplayed());

        }*/

        @Test(priority = 6)
        public void details()
        {
            WebElement ele= driver.findElement(By.id("welcome"));
            System.out.println(ele.isDisplayed());
            driver.quit();

        }


}
