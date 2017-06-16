package scripts.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDrivers {

	WebDriver driver = null;
	protected static final Logger logger = Logger.getLogger(SeleniumDrivers.class);

	//FirefoxDriver setting
	public WebDriver firefoxDriver() {
		//ProfilesIni pi = new ProfilesIni();
		//FirefoxProfile profile = pi.getProfile("default");
		//driver = new FirefoxDriver(profile);
		driver = new FirefoxDriver();
		return driver;
	}

	//IEDriver setting
	public WebDriver ieDriver() {
		//System.setProperty("webdriver.chrome.driver", "E:/Selenium/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		//driver = new InternetExplorerDriver();
		//PageFactory.initElements(driver, this);
		driver = new InternetExplorerDriver();
		return driver;
	}

	//chromeDriver setting
	public WebDriver chromeDriver() {
		//System.setProperty("webdriver.chrome.driver", "E:/Selenium/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		//driver = new ChromeDriver();
		//PageFactory.initElements(driver, this);
		driver = new ChromeDriver();
		return driver;
	}

	//消除Chrome“您使用的是不受支持的命令行标记--ignore-certificate--error” 提示信息
	/*
	public void startChromeDriver(String chrome_dir) {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/Selenium Browser driver/chromedriver_win32/chromedriver.exe");
		try {
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--test-type");
			capabilities.setCapability("chrome.binary", "src/ucBrowserDriversromedriver.exe");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			driver.manage().window().maximize();
			//get(baseUrl, 3); //, String baseUrl
		} catch (Exception e) {
			logger.error("执行startChromeDriver()方法发生异常，异常信息：", e);
		}
	}
	*/
}
