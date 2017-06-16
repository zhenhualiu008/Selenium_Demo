package scripts.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by lzh on 2017/6/15.
 */
public class InteractionsActions {

    protected static final Logger logger = Logger.getLogger(InteractionsActions.class);

    public void moveToElement(By by, WebDriver driver) {

        WebElement moveToButton = driver.findElement(by);
        Actions action = new Actions(driver);
        action.moveToElement(moveToButton).perform();

    }

    public void dragAndDrop(By by, WebDriver driver) {

        WebElement draggable = driver.findElement(by);
        Actions action = new Actions(driver);
        action.dragAndDropBy(draggable, 10, 0).build().perform();

    }

    public void keyBoard(WebDriver driver) {
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL);//点击control键
        action.keyDown(Keys.SHIFT);//点击shift键
        action.keyUp(Keys.CONTROL);//松开control键
        action.keyUp(Keys.SHIFT);//松开shift键
        action.keyDown(Keys.TAB);//点击Tab键
        action.keyUp(Keys.TAB);//松开tab键
    }
}
