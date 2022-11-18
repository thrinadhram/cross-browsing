package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class RobotClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        /*driver.get("http://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.xpath("//*[@id='textbox']")).sendKeys("mani");
        driver.findElement(By.xpath("//*[@id='createTxt']")).click();
        driver.findElement(By.xpath("//*[@id='link-to-download']")).click();*/
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.linkText("Add Employee")).click();
        Actions act=new Actions(driver);

       act.click(driver.findElement(By.cssSelector("#photofile"))).build().perform();
        StringSelection selection=new StringSelection("C:\\Users\\91863\\Desktop\\mani.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);





    }
}
