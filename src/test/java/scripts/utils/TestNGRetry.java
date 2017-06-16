package scripts.utils;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by lzh on 2017/6/12.
 */
public class TestNGRetry implements IRetryAnalyzer {
    protected static final Logger logger = Logger.getLogger(TestNGRetry.class);
    private int retryCount = 1;
    private int maxRetryCount=4;


    public boolean retry(ITestResult result) {
        if (retryCount <= maxRetryCount) {
            String message = "running retry for  '" + result.getName() + "' on class " +
                    this.getClass().getName() + " Retrying " + retryCount + " times";
            logger.info(message);
            retryCount++;
            return true;
        }
        return false;
    }

}
