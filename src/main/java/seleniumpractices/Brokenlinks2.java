package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Brokenlinks2 {}
   /* WebDriver driver;
    public void alert(){
        Alert alert = driver.switchTo().alert();
    }
    public static void main(String[] args) throws IOException {
     WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://demo.guru99.com/test/newtours/");
       driver.get("http://google.com");
        Alert alert = driver.switchTo().alert();

        List<WebElement>links= driver.findElements(By.tagName("a"));
        //System.out.println(links);
           int link= links.size();
        System.out.println(link);
        for(int i=0;i<link;i++){
            WebDriverWait wait = new WebDriverWait(driver,100);
            if(wait.until(ExpectedConditions.alertIsPresent()!=null)){
                alert.accept();
            }
           WebElement element= links.get(i);
          String str= element.getAttribute("href");
          URL s=new URL(str);
            HttpURLConnection httpconnect=(HttpURLConnection)s.openConnection();
            httpconnect.connect();
            int rescode=httpconnect.getResponseCode();
           if(rescode>=400){
               System.out.println("broken links--->"+str);
           }
           else {
               System.out.println("valid links--->"+str);
           }


        }






    }
}*/
