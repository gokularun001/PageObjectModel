package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    //constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    //locators
    By user_name=By.xpath("//input[@placeholder='Username']");
    By user_password=By.xpath("//input[@placeholder='Password']");
    By click=By.xpath("//button[@type='submit']");

    //Action methods

    public void setUserName(String user) {
        driver.findElement(user_name).sendKeys(user);
    }
    public void setUserPassword(String pass) {
        driver.findElement(user_password).sendKeys(pass);
    }
    public void clickLogin() {
        driver.findElement(click).click();
        //without using page Factory
    }
}
