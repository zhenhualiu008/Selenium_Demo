package scripts.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by lzh on 2017/6/16.
 */
public class SwitchHandle {

    public void switchNewHandle(By by, WebDriver driver) {
        String curHandle = driver.getWindowHandle();
        //click new handle
        driver.findElement(by).click();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        while(it.hasNext()) {
            if(curHandle == it.next()) {
                continue;
            }
            String newHandle = it.next();
            driver.switchTo().window(newHandle);
            break;
        }

    }
}
