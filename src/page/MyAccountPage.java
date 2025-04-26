package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.BaseTest;

public class MyAccountPage extends BaseTest
{
    WebDriver driver;

    public MyAccountPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement msgHeading;

    public boolean isMyAccountPageExists()
    {
       // return (msgHeading.isDisplayed());
        try
        {
            return (msgHeading.isDisplayed());
        } catch (Exception e) {
            return false;
        }
    }
}
