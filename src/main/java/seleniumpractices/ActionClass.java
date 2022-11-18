package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Actions act=new Actions(driver);
        WebElement admin=driver.findElement(By.cssSelector("#menu_admin_viewAdminModule"));
        WebElement usermg=driver.findElement(By.cssSelector("#menu_admin_UserManagement"));
        WebElement user=driver.findElement(By.cssSelector("#menu_admin_viewSystemUsers"));
        //Actions act=new Actions(driver);
        act.moveToElement(admin).build().perform();
        act.moveToElement(usermg).build().perform();
        act.moveToElement(user).click().build().perform();	}

}


