package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.findElement(By.partialLinkText("Open New Tabbed Windows "));
        driver.findElement(By.partialLinkText("Open New Seperate Windows"));
        driver.findElement(By.partialLinkText("Open Seperate Multiple Windows"));
       Set<String> window= driver.getWindowHandles();
        System.out.println(window.size());








    }
}
