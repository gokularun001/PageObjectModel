package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.BaseTest;

public class LoginPageHome extends BaseTest
{
    WebDriver driver;

    public LoginPageHome(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailAddress;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtPassword;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement btnLogin;

    public void setEmailAndPassword(String email,String pass)
    {
        emailAddress.sendKeys(email);
        txtPassword.sendKeys(pass);
    }
    public void clickLoginButton()
    {
        btnLogin.click();
    }
}
