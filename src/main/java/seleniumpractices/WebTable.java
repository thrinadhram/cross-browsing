package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement table=  driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody"));
        List<WebElement> rows=table.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
        int rowcount=rows.size();
        System.out.println(rowcount);

        List<WebElement> column=table.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th"));
        int columncount=column.size();
        for(int i=2;i<=rowcount;i++){
            for (int j=1;j<=columncount;j++) {
                System.out.print(table.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText() + "  ");
            }
            System.out.println();



    }}
}
