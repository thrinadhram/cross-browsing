package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifraames {
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame("Iframe with in an Iframe");
       String ele= driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).getText();
      System.out.println(ele);
       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //navigates to the Browser
        driver.get("http://demo.guru99.com/test/guru99home/");
        // navigates to the page consisting an iframe

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID

        System.out.println("********We are switch to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();
        //Clicks the iframe

        System.out.println("*********We are done***************");*/
    }
}












