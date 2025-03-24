package testcase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
       this.driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    public String generateRandomString(int length){
        String randomString= RandomStringUtils.randomAlphanumeric(length);
        return randomString;
    }
    public String generateRandomNumeric(int lenght){
        String randomString= RandomStringUtils.randomNumeric(lenght);
        return randomString;
    }
}
