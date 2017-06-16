package scripts.testscripts.testNG;

import org.testng.annotations.*;

/**
 * Created by lzh on 2017/6/16.
 */
public class TestNGAnnotation {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1. @BeforeSuite 第一个执行；");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("2. @BeforeTest  小的测试集合之前执行；");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("3. @BeforeClass  当期测试类 之前执行；");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("4. @BeforeMethod  每个测试用例执行，都需要执行；");
    }

    @Test
    public void f1() {
        System.out.println("5. @Test  第一个测试用例开始执行；");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("6. @AfterMethod  每个测试用例执行之后，都需要执行；");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("7. @AfterClass  当前测试类执行完毕，才开始执行；");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("8. @AfterTest  小的测试集合执行完毕，才开始执行；");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("9. @AfterSuite 大的测试集合执行完毕，才开始执行；" );
    }
}
