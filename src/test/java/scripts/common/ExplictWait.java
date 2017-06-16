package scripts.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

    protected static final Logger logger = Logger.getLogger(ExplictWait.class);
	
	public static WebElement waitForElement(WebDriver driver, By by) {
    
        WebElement targetElement = (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(by));
        return targetElement;  
        
    }

    public static WebElement elementIsExist(WebDriver driver, By by, int second) {

        WebDriverWait wait = new WebDriverWait(driver, second);
        WebElement targetElement = null;
        try {
            targetElement = wait.until(ExpectedConditions.presenceOfElementLocated(by));

        } catch (NoSuchElementException e) {
            logger.error(e.getMessage());
        }
        return targetElement;
    }

    public static WebElement elementIsToBeClickable(WebDriver driver, By by, int second) {

        WebDriverWait wait = new WebDriverWait(driver, second);
        WebElement targetElement = null;
        try {
            targetElement = wait.until(ExpectedConditions.elementToBeClickable(by));

        } catch (NoSuchElementException e) {
            logger.error(e.getMessage());
        }
        return targetElement;
    }

    public static Boolean elementIsToBeSelected(WebDriver driver, By by, int second) {

        WebDriverWait wait = new WebDriverWait(driver, second);
        Boolean isSelected = null;
        try {
            isSelected = wait.until(ExpectedConditions.elementToBeSelected(by));

        } catch (NoSuchElementException e) {
            logger.error(e.getMessage());
        }
        return isSelected;
    }

    public static Boolean titleIsDisplayed(WebDriver driver, String title, int second) {

        WebDriverWait wait = new WebDriverWait(driver, second);
        Boolean isDisplayed = null;
        try {
            isDisplayed = wait.until(ExpectedConditions.titleContains(title));

        } catch (NoSuchElementException e) {
            logger.error(e.getMessage());
        }
        return isDisplayed;
    }

    public static WebElement customWait(WebDriver driver, final By by, int second) {

        WebDriverWait wait = new WebDriverWait(driver, second);
        WebElement targetElement = null;
        try {
            targetElement = wait.until(new ExpectedCondition<WebElement>() {
                @Override
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        } catch(NoSuchElementException e) {
            logger.error(e.getMessage());
        }
        return targetElement;
    }

}
