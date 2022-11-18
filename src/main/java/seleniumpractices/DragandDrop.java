package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions act=new Actions(driver);
     WebElement source= driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
     WebElement source1=driver.findElement(By.xpath("//*[@id='gallery']/li[2]"));
     WebElement target=driver.findElement(By.xpath("//*[@id='trash']"));
     act.clickAndHold(source).clickAndHold(source1).moveToElement(target).release().build().perform();

    }
}
