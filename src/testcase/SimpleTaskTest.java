package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.SimpleTask;

public class SimpleTaskTest extends BaseTest {
    @Test
    void log(){
        SimpleTask st=new SimpleTask(getDriver());
        st.setUserName(generateRandomString(8),generateRandomNumeric(7));
        st.clickLogin();
        Assert.assertEquals(getDriver().getTitle(),"OrangeHRM");
    }
}
