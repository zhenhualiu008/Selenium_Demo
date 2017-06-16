package scripts.testscripts.testNG;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by lzh on 2017/6/16.
 */
public class TestDataPrivetor {

    private WebDriver driver = null ;

    /**
     * 执行测试类的前置条件：打开浏览器；
     */
    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    /**
     * 使用dataProvider属性，来声明当前用例的变量（参数列表中的search）来源于：testSearchProvider这个方法。
     * @param search
     */
    @Test(dataProvider = "testSearchProvider" )
    public void testSearch(String search) {
        boolean flag = false;
        try {
            Thread.sleep(500);
            driver.get("http://www.baidu.com/");
            driver.findElement(By.id("kw")).sendKeys(search);
            driver.findElement(By.id("su")).click();
            Thread.sleep(500);
            flag = driver.getPageSource().contains(search);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertTrue(flag);
    }

    /**
     * 测试用例全部执行完毕，关闭浏览器；
     */
    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    /**
     * 为测试用例提供参数；
     * @return
     */
    @DataProvider
    public Object[][] testSearchProvider(){ //参数是一个二维数组，不止一个参数，那么就会循环执行，分别搜索这4个关键字，共执行4次；
        return new Object[][]{{"自动化"},
                {"selenium"},
                {"java"},
                {"python"}};
    }
}
