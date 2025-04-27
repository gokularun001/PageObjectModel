package testcase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utility.Log;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public static ThreadLocal<WebDriver>driver=new ThreadLocal<>();
    //WebDriver driver;
    //FileReader file;
    //Properties p;

    public static WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod (groups = {"Sanity","Regression"})
    @Parameters//({"os","browser"})
    public void setup() throws IOException
    {
        Log.info("Initializing WebDriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new");
        driver.set(new ChromeDriver(options));
       //this.driver=new ChromeDriver();
       //file= new FileReader(System.getProperty("user.dir")+"\\src\\resources\\sample.properties");
       //p=new Properties();
       //p.load(file);
       // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       // Log.info("Navigating to practicetestautomation");
        //driver.get("https://practicetestautomation.com/practice-test-login/");
//        switch (br.toLowerCase())
//        {
//            case "chrome":getDriver()=new ChromeDriver();break;
//            case "edge":getDriver()=new EdgeDriver();break;
//            case "firefox":getDriver()=new FirefoxDriver();break;
//            default:Log.info("Invalid browser name");return;
//        }
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //getDriver().get(p.getProperty("appURL2"));
        getDriver().manage().window().maximize();

    }
    @AfterMethod(groups = {"Sanity","Regression"})
    public void close()
    {
        getDriver().quit();
        driver.remove();
    }
    public String generateRandomString(int length)
    {
        String randomString= RandomStringUtils.randomAlphanumeric(length);
        return randomString;
    }
    public String generateRandomNumeric(int lenght)
    {
        String randomString= RandomStringUtils.randomNumeric(lenght);
        return randomString;
    }
    public String generateRandomAlphaNumeric(int lenght)
    {
        String randomAlphaNumber=RandomStringUtils.randomAlphabetic(lenght);
        String randomAlphaString=RandomStringUtils.randomNumeric(lenght);
        return (randomAlphaString+"@"+randomAlphaNumber);
    }
}
