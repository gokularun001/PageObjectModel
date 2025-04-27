package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.BaseTest;

public class HomePage extends BaseTest
{
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccount;
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;
    @FindBy(linkText = "Login")
    WebElement linkLogin;

    public void clickMyAccount()
    {
        myAccount.click();
    }
    public void clickRegister()
    {
        register.click();
    }
    public  void clickLogin()
    {
        linkLogin.click();
    }
}
