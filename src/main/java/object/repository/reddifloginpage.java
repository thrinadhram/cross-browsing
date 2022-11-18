package object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reddifloginpage {
    WebDriver driver;
    //to assign element locator values
    public reddifloginpage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name="login")
    WebElement uname;

    @FindBy(xpath ="//*[@id='password']")
    WebElement pwdObj;

    @FindBy(name="proceed")
    WebElement signinBtnObj;

    //methods to return webelements
  /*  public void username(String name) {

       uname.sendKeys(name);
    }*/
    public WebElement utxt(){
        return (uname);
    }

    public WebElement pwdTxt() {
        return (pwdObj);
    }

    public WebElement signinBtn() {
        return (signinBtnObj);
    }
}
