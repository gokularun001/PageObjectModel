package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage2 {
    WebDriver driver;
    //constructor
    public LoginPage2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //locators
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement user_name;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement user_password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement click;//for elements
    //@FindBy(tagName = "a")
    //List<WebElement> links; for elements
    //@FindBy(how = How.XPATH, using="//input[@placeholder='Username']")//another method

    //Action methods

    public void setUserName(String user) {
        user_name.sendKeys(user);
    }
    public void setUserPassword(String pass) {
        user_password.sendKeys(pass);
    }
    public void clickLogin() {
        click.click();
        //with page Factory
    }
}



