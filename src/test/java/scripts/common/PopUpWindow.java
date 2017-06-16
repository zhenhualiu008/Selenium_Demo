package scripts.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;

/**
 * Created by lzh on 2017/6/15.
 */
public class PopUpWindow {

    protected static final Logger logger = Logger.getLogger(PopUpWindow.class);

    public void alertWindowConfirm(By by, WebDriver driver) {

        WebElement alertButton = driver.findElement(by);
        if (alertButton.isEnabled()) {
            alertButton.click();
            try {
                Alert alert = driver.switchTo().alert();
                //String alertText = alert.getText();
                alert.accept();
            } catch (NoAlertPresentException e) {
                logger.error(e.getMessage());
            }
        }
    }

    public void confirmWindowConfirm(By by, WebDriver driver) {

        WebElement confirmButton = driver.findElement(by);
        if (confirmButton.isEnabled()) {
            confirmButton.click();
            try {
                Alert confirmWindow = driver.switchTo().alert();
                //String confrimText = confirmWindow.getText();
                confirmWindow.accept();
            } catch (NoAlertPresentException e) {
                logger.error(e.getMessage());
            }
        }
    }

    public void confirmWindowCancel(By by, WebDriver driver) {

        WebElement confirmButton = driver.findElement(by);
        if (confirmButton.isEnabled()) {
            confirmButton.click();
            try {
                Alert confirmWindow = driver.switchTo().alert();
                //String confrimText = confirmWindow.getText();
                confirmWindow.dismiss();
            } catch (NoAlertPresentException e) {
                logger.error(e.getMessage());
            }
        }
    }

    public void promptWindowConfirm(By by, WebDriver driver, String text) {

        WebElement promptButton = driver.findElement(by);
        if (promptButton.isEnabled()) {
            promptButton.click();
            try {
                Alert promptWindow = driver.switchTo().alert();
                //String confirmText = promptWindow.getText();
                promptWindow.sendKeys(text);
                promptWindow.accept();
            } catch (NoAlertPresentException e) {
                logger.error(e.getMessage());
            }
        }

    }

    public void promptWindowCancel(By by, WebDriver driver, String text) {

        WebElement promptButton = driver.findElement(by);
        if (promptButton.isEnabled()) {
            promptButton.click();
            try {
                Alert promptWindow = driver.switchTo().alert();
                //String confirmText = promptWindow.getText();
                promptWindow.sendKeys(text);
                promptWindow.dismiss();
            } catch (NoAlertPresentException e) {
                logger.error(e.getMessage());
            }
        }

    }


}
