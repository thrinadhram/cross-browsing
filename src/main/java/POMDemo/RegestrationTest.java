package POMDemo;

import POMDemo.Regestrationpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegestrationTest {

    @Test
    public  void verifrflightreg(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/newtours/register_sucess.php");
        Regestrationpage rgp=new Regestrationpage(driver);


       rgp.clickreglink();
       rgp.FirstName("Manikanta");
        rgp.LastNmae("mani");
        rgp.Phone("8639405516");
        rgp.Email("dmkanta15");
        rgp.Address("s.yanam");
        rgp.City("amalapuram");
        rgp.setState("AP");
        rgp.setpcode("533213");
        rgp.setcountry("INDIA");

        rgp.setusername("Dmanikanta");
        rgp.setconforpassword("mani@123");
        rgp.setbuttion();

        if(driver.getPageSource().contains("Thank you for registering")){
            System.out.println("Successful registration");
        }
        else{
            System.out.println("Your registration failed");
        }
        driver.close();


    }
}
