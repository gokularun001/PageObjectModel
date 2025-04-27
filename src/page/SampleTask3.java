package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.BaseTest;

public class SampleTask3 extends BaseTest {
    WebDriver driver;

    public SampleTask3(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")
    WebElement loggoutt;

    public void logout(){
        loggoutt.click();
    }
}

