package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.LoginPage;

import java.time.Duration;

public class LoginPageTest {
    WebDriver driver;
    @BeforeClass
    void log(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test
    void execute(){
        LoginPage gokul=new LoginPage(driver);
        gokul.setUserName("Admin");
        gokul.setUserPassword("admin123");
        gokul.clickLogin();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterClass
    void sucess(){
        driver.quit();
        System.out.println("Test is passed");
        //without using pageFactory
    }
}
