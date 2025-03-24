package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.BaseTest;

public class SimpleTask extends BaseTest {
    WebDriver driver;

    public SimpleTask (WebDriver driver)
    {this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement userpassword;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonclick;
    public void setUserName(String user,String pass) {
        username.sendKeys(user);
        userpassword.sendKeys(pass);
    }
    public void clickLogin(){
        buttonclick.click();
    }
}
