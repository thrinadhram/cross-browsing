package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions act=new Actions(driver);
      WebElement element= driver.findElement(By.xpath("//*[text()='Click Me']"));
        act.click(element).build().perform();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
    }
}
