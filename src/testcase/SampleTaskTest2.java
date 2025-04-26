package testcase;

import org.testng.annotations.Test;
import page.SampleTask2;
import utility.Log;

public class SampleTaskTest2 extends BaseTest{
    @Test(priority = 1)
    void log(){
        SampleTask2 st2=new SampleTask2(getDriver());
        st2.login("student","Password123");
        Log.info("Successfully Login");
    }
    @Test(priority = 2)
    void logInvalid(){
        SampleTask2 st2=new SampleTask2(getDriver());
        String usern=generateRandomString(5)+"@gmail.com";
        String passn=generateRandomNumeric(5);
        st2.login(usern,passn);
        Log.info("test is done");
        //st2.login(generateRandomString(5),generateRandomNumeric(5));
    }
}
