package scripts.testscripts.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by lzh on 2017/6/16.
 */
public class TestAssert {

    private WebDriver driver = null ;
    private String chromeDriverDir = "D:\\workspace\\A_Test\\resource\\chromedriver.exe";

    /**
     * 执行测试类的前置条件：打开浏览器、打开网址；
     */
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", chromeDriverDir);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com/");
    }

    /**
     * 根据期望的字符串值，和期望字符串对比，断言用例执行成功与否： Assert.assertEquals
     */
    @Test(priority=0)
    public void testTitle() {
        //获取百度首页的title值；
        String actualTitle = driver.getTitle();
        //使用断言：实际的title值、和预期值比较，如果两者相同，则判断这条用例执行成功，否则这条用例执行失败。
        Assert.assertEquals(actualTitle, "百度一下，你就知道");
    }

    /**
     * 根据标志flag的值，断言用例执行成功与否： Assert.assertTrue
     */
    @Test
    public void testFlag() {
        boolean flag = false ;//声明一个初始布尔值，作为执行结果的判断值；
        WebElement inputBox = driver.findElement(By.id("kw"));
        //判断输入框是否在页面上显示，取反，赋值给flag；
        flag = !inputBox.isDisplayed();
        //根据标志flag的值，flag = true，判断用例执行成功。否则执行失败。
        Assert.assertTrue(flag);
    }

    /**
     * 测试用例全部执行完毕，关闭浏览器；
     */
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
