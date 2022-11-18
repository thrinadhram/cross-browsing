package seleniumpractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.in");
       Set<Cookie> cookie=driver.manage().getCookies();
        System.out.println(cookie.size());
       int size= cookie.size();
    /*   for(Cookie coki:cookie){
          String str= coki.getName()+" "+coki.getValue();
           System.out.println(str);
       }
       // System.out.println(driver.manage().getCookieNamed("session-id-time"));
        Cookie obj=new Cookie("manikanta","12345");
        driver.manage().addCookie(obj);
        Set<Cookie>cookies=driver.manage().getCookies();
        for(Cookie coki:cookies){
            System.out.println(coki.getName()+" "+coki.getDomain()+"---"+coki.getValue());
        }*/
       driver.manage().deleteAllCookies();
       cookie=driver.manage().getCookies();
        System.out.println(cookie.size());








    }
}
