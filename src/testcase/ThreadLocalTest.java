package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import page.HomePage;
import page.LoginPageHome;
import page.SampleTask2;
import page.SampleTask3;


import utility.Log;

import static java.sql.DriverManager.getDriver;

public class ThreadLocalTest extends BaseTest{
    @Test(groups = "Sanity")
    void verifyHomescreen()  {
        getDriver().get("https://practicetestautomation.com/practice-test-login/");
       // Thread.sleep(5000);
        getDriver().manage().window().maximize();
        SampleTask2 ls = new SampleTask2(getDriver());
        SampleTask3 hs = new SampleTask3(getDriver());
        generateRandomNumeric(5);
        ls.login("student", "Password123");
        getDriver().findElement(By.xpath("//h1[text()='Logged In Successfully']")).isDisplayed();
        hs.logout();
    }

    @Test
    void verifyBing() throws InterruptedException {
        getDriver().get("https://www.facebook.com");
        getDriver().manage().window().maximize();
        System.out.println(getDriver().getCurrentUrl());
        System.out.println("Title - "+ getDriver().getTitle());
    }
}

