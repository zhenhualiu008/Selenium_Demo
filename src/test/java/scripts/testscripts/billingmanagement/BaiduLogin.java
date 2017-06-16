/****************************************************************************
 * Created by Terry Liu
 * Created Date: 10/23/2015
 * Description: Fill in PSA
*****************************************************************************/
package scripts.testscripts.billingmanagement;

import java.util.concurrent.TimeUnit;

import scripts.common.SeleniumDrivers;
import scripts.common.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import scripts.pageobjects.LoginPage;
import scripts.pageobjects.SelectChannel;


/**
 * @author Terry liu
 * 
 * Create one PSTN order
 */
public class BaiduLogin extends TestCase {

	LoginPage login = new LoginPage();
	SelectChannel selectChannel =  new SelectChannel();
	WebElementActions webAction = new WebElementActions();
	SeleniumDrivers drivers = new SeleniumDrivers();
	private String usernameCSS = "#username";
	private String passwordCSS = "#password";
	private String loginBtnCSS = "#Login";
	protected static final Logger logger = Logger.getLogger(BaiduLogin.class);
	
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		 this.driver = drivers.firefoxDriver();
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
	
	@Test
	public void testwebTestOpenLink() throws InterruptedException
	{
		 driver.get("https://www.baidu.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id=\"kw\"]")).sendKeys("输入文字测试");
		 logger.info("login baidu successfully");

	}
}