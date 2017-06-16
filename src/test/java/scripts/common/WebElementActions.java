package scripts.common;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class WebElementActions {

	protected static final Logger logger = Logger.getLogger(WebElementActions.class);
	
	/*Get element text*/
	public String getText(String css, WebDriver driver){
		return driver.findElement(By.cssSelector(css)).getText();
	}
	
	/*send values*/
	public void sendKeys(By by, String value,  WebDriver driver) {
		driver.findElement(by).sendKeys(value);
	}
	
	/*click action*/
	public void clickButton(By by, WebDriver driver) {
		driver.findElement(by).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	/*double click*/
	public void doubleClick(By by, WebDriver driver){
		WebElement inputText = driver.findElement(by);
		Actions action = new Actions(driver);
		action.doubleClick(inputText).build().perform();
	}

	/*right click*/
	public void rightClick(By by, WebDriver driver){
		WebElement inputText = driver.findElement(by);
		Actions action = new Actions(driver);
		action.contextClick(inputText).build().perform();
	}
	
	/*web element is exist*/
	public boolean isWebElementExist(By by, WebDriver driver) {
		try {
			driver.findElement(by);
			return true;
		} catch(NoSuchElementException e){
			return false;
		}
	}
	
	/*click dropdownlist by value*/
	public void clickDropDownByValue(By by, WebDriver driver, String selValue) {
		Select select = new Select(driver.findElement(by));
		select.selectByValue(selValue);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	/*click dropdownlist by index*/
	public void clickDropDownByIndex(By by, WebDriver driver, int index) {
		Select select = new Select(driver.findElement(by));
		select.selectByIndex(index);
	}

	/*click dropdownlist by Text*/
	public void clickDropDownByText(By by, WebDriver driver, String text) {
		Select select = new Select(driver.findElement(by));
		select.selectByVisibleText(text);
	}
	
	/*click radio button*/
	public void clickRadioButton(By by, WebDriver driver) {
		WebElement ele = driver.findElement(by);
		if (!ele.isSelected()) {
			driver.findElement(by).click();
		} else {
			logger.info("Radio button has been selected");
		}
	}
	
	/*click check box*/
	public void clickCheckBox(By by, WebDriver driver) {
		WebElement ele = driver.findElement(by);
		if (!ele.isSelected()) {
			driver.findElement(by).click();
		} else {
			logger.info("Checkbox has been selected");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	/*click LinkText*/
	public void clickLinkText(By by, WebDriver driver){
		WebElement link = driver.findElement(by);
		link.click();
	}

	/*browser back*/
	public void browserBack(WebDriver driver) {
		driver.navigate().back();
	}

	/*browser forward*/
	public void browserForward(WebDriver driver) {
		driver.navigate().forward();
	}

	/*refresh current page*/
	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	/*max windows*/
	public void maxWindows(WebDriver driver){
		driver.manage().window().maximize();
	}

	/*get current page title*/
	public String getTitle(WebDriver driver){
		String title = driver.getTitle();
		return title;
	}

	/*get Page Source*/
	public String getPageSource(WebDriver driver){
		String source = driver.getPageSource();
		return source;
	}

	/*get current URL*/
	public String getCurrentUrl(WebDriver driver){
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
}
