package object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reddifHomePage {
    WebDriver driver;

    public reddifHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="Sign in")
    WebElement signinObj;

    //Method to return webelement

    public WebElement lnkSignin() throws InterruptedException {
        return (signinObj);
    }
}
