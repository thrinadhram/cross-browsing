package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
      /*  driver.get("https://testautomationpractice.blogspot.com/");
        driver.switchTo().frame(0);


        Actions act=new Actions(driver);
        act.moveToElement(slider).dragAndDropBy(slider,500,0).build().perform();*/
        driver.get("http://demo.automationtesting.in/Slider.html");

        WebElement slider=driver.findElement(By.xpath("//*[@id='slider']"));
        Actions act=new Actions(driver);
        act.moveToElement(slider).dragAndDropBy(slider,500,0).build().perform();










    }
}
