package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPageHome;
import page.MyAccountPage;
import utility.Log;

public class LoginPageHomeTest extends BaseTest{

    @Test
    public void verifyLogin()
    {
        Log.info("Starting LoginPageHomeTest");
        HomePage hp=new HomePage(getDriver());
        LoginPageHome lph= new LoginPageHome(getDriver());
        MyAccountPage map= new MyAccountPage(getDriver());
        hp.clickMyAccount();
        hp.clickLogin();
       // lph.setEmailAndPassword(p.getProperty("email"),p.getProperty("password"));
        lph.clickLoginButton();
        boolean targetPage=map.isMyAccountPageExists();
        //Assert.assertTrue(targetPage);
        Assert.assertEquals(targetPage,true,"Login failed");
        Log.info("Finished LoginPageHomeTest");
    }
}
