package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropDownSorting {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
       WebElement dropdown= driver.findElement(By.cssSelector("#animals"));
        Select sc=new Select(dropdown);
       List<WebElement>drop= sc.getOptions();
       List values=new ArrayList();
       for(WebElement i:drop){
           values.add(i.getText());
       }
        System.out.println("original values"+values);
       List temvalues=new ArrayList(values);
        Collections.sort(temvalues);
        if(temvalues.equals(values)){
            System.out.println("dropdown is sorted");
        }
        else {
            System.out.println("drop dpown not sorted");
        }





    }

}
