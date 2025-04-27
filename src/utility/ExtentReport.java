package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReport implements ITestListener {

    private ExtentReports extent;
    private ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        // Create the ExtentHtmlReporter with the path to the report file
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");

        // Create the ExtentReports instance and attach the reporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Start a new test case in the report
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Log the success of the test
        test.pass("Test Passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Log the failure of the test and add exception details
        test.fail("Test Failed: " + result.getMethod().getMethodName());
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Log the skipped test
        test.skip("Test Skipped: " + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Write the test results to the report
        extent.flush();
        //MailTool.sendEmailWithReport(System.getProperty("user.dir")+"extent-report.html");
    }
}
