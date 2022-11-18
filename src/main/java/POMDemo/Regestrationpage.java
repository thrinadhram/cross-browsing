package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regestrationpage {
    WebDriver driver;

   By regilink= By.linkText("REGISTER");
   By firstname=By.name("firstName");
   By lastname=By.name("lastName");
By phone=By.name("phone");
By email=By.name("userName");
By address1=By.name("address1");
By city=By.name("city");
By State=By.name("state");
By postacode=By.name("postalCode");
By country=By.name("country");
By username=By.name("email");
By password=By.name("password");
By confpwd=By.name("confirmPassword");
By button=By.name("submit");
By text=By.name("mani");

public void linj(){
    driver.findElement(text).click();
}
public Regestrationpage(WebDriver d){

    driver=d;
}
public void clickreglink(){
    driver.findElement(regilink).click();
}
public void FirstName(String fname){
    driver.findElement(firstname).sendKeys("fname");
}
public void LastNmae(String lname){
    driver.findElement(lastname).sendKeys("lname");
}
public  void Phone(String ph){
    driver.findElement(phone).sendKeys("ph");
}
public  void Email(String mail){
    driver.findElement(email).sendKeys("mail");
}
public  void Address(String add){
    driver.findElement(address1).sendKeys("add");
}
public  void City(String cty){
    driver.findElement(city).sendKeys("cty");
}
public  void setState(String state){
    driver.findElement(State).sendKeys("state");
}
public void setpcode(String code){
    driver.findElement(postacode).sendKeys("code");
}
public void setcountry(String coun){
    driver.findElement(country).sendKeys("coun");
}
public  void setusername(String uname){
    driver.findElement(username).sendKeys("uname");
}
public  void setpassword(String pass){
    driver.findElement(password).sendKeys("pass");
}
public  void setconforpassword(String cpass){
    driver.findElement(confpwd).sendKeys("cpass");
}
public  void setbuttion(){
    driver.findElement(button).click();
}


}
