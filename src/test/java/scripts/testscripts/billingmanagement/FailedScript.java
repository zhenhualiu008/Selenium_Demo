/****************************************************************************
 * Created by Terry Liu
 * Created Date: 09/11/2015
 * Description: 
*****************************************************************************/
package scripts.testscripts.billingmanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.*;
import junit.framework.TestCase;

import scripts.pageobjects.LoginPage;
import scripts.pageobjects.SelectChannel;

/**
 * @author Terry Liu
 *
 */
public class FailedScript extends TestCase {

    LoginPage login = new LoginPage();
    SelectChannel selectChannel =  new SelectChannel();
    protected static final Logger logger = LoggerFactory.getLogger(FailedScript.class);
    WebDriver driver = null;

    //@Test(invocationCount = 100)
    @Test
    public void testwebTestOpenLink() throws InterruptedException
    {
        driver.findElement(By.cssSelector(".fdsecondary > ul > li:nth-child(1) > a")).click();
    }

    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");
    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }

}