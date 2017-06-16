package scripts.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by lzh on 2017/6/14.
 */
public class TestNGListener extends TestListenerAdapter {

    private static WebDriver driver = new FirefoxDriver();

    protected static final Logger logger = Logger.getLogger(TestNGListener.class);

//    public static void setDriver(WebDriver driver) {
//        TestNGListener.driver = driver;
//    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        logger.info("Test Success");
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        logger.error("Test Failure");
        super.onTestFailure(tr);
//        ScreenShot screenShot = new ScreenShot((TakesScreenshot)driver);
//        screenShot.getScreenShot();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        logger.error("Test Skipped");
        super.onTestSkipped(tr);
    }

    @Override
    public void onStart(ITestContext testContext) {
        logger.info("Test Start");
        super.onStart(testContext);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        logger.info("Test Finish");
        super.onFinish(testContext);
    }
}
