package scripts.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by lzh on 2017/6/16.
 */
public class FrameOperation {

    protected static final Logger logger = Logger.getLogger(InteractionsActions.class);

    public static void goFrameByIndex(WebDriver driver, int frameIndex) {
        driver.switchTo().frame(frameIndex);
    }

    public static void goFrameById(WebDriver driver, String frameId) {
        driver.switchTo().frame(frameId);
    }

    public static void goFrameByElement(WebDriver driver, WebElement frameElement) {
        driver.switchTo().frame(frameElement);
    }

    public static void goToDefaultPage(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

}
