package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.LoginPage;
import page.LoginPage2;

import java.time.Duration;

public class LoginPage2Test {
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
        LoginPage2 arun=new LoginPage2(driver);
        arun.setUserName("Admin");
        arun.setUserPassword("admin123");
        arun.clickLogin();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterClass
    void sucess(){
        driver.quit();
        System.out.println("Test is completed");
        //with pageFactory
    }
}


