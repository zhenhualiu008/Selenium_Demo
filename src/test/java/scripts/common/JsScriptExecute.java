package scripts.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by lzh on 2017/6/15.
 */
public class JsScriptExecute {

    protected static final Logger logger = Logger.getLogger(WebElementActions.class);

    public void operateTarget(By by, WebDriver driver) {

        WebElement wb = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=XXXXX;", wb);

    }

}
