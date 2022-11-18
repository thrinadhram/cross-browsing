package com.TestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import object.repository.reddifHomePage;
import object.repository.reddifloginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.PageFactory.initElements;

public class reddiflogintest {
    @Test
    public void login() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
      //  WebDriver driver = new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("http://rediffmail.com");
        driver.manage().window().maximize();

        //to initialize "object.repository" package classes
      //  reddifHomePage rhp= PageFactory.initElements(driver, reddifHomePage.class);
      //  reddiflogintest	rlp= initElements(driver, reddiflogintest.class);
        reddifHomePage rhp=new reddifHomePage(driver);
        reddifloginpage rlp=new reddifloginpage(driver);
        //To perform Login operation
        rhp.lnkSignin().click();

       Thread.sleep(4000);
       // rlp.username("mani");
        rlp.pwdTxt().sendKeys("Mercury");
        rlp.signinBtn().click();
       // rhp.lnkSignin().sendKeys("manikanta");

    }
}
