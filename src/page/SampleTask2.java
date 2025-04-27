package page;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.BaseTest;

public class SampleTask2 extends BaseTest {
    WebDriver driver;

    public SampleTask2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement userpassword;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement buttonclick;

    public void login(String user,String pass){
        username.sendKeys(user);
        userpassword.sendKeys(pass);
        buttonclick.click();
    }
}
