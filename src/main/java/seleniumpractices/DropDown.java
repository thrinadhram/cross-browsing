package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
       WebElement element= driver.findElement(By.cssSelector("#files"));
        Select dropdown=new Select(element);
        dropdown.selectByIndex(2);

      /* List<WebElement>drop= dropdown.getOptions();
       int size=drop.size();
        System.out.println(drop);
        for(int i=0;i<size;i++){
            String str=drop.get(i).getText();
            System.out.println(str);*/
        }




}
