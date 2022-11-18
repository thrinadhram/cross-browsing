package object.repository;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestData {
    public static void main(String[] args) throws InterruptedException {


     WebDriverManager.firefoxdriver().setup();
    WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.rediff.com/");
        reddifHomePage rh=new reddifHomePage(driver);
        reddifloginpage rl=new reddifloginpage(driver);
        rh.lnkSignin().click();
        //rl.username("mani");
        rl.utxt().sendKeys("manikanta");
        rl.pwdTxt().sendKeys("12345");
        rl.signinBtn().click();
}}
