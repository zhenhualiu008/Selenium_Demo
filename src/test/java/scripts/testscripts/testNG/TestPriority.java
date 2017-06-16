package scripts.testscripts.testNG;

import org.testng.annotations.Test;

/**
 * Created by lzh on 2017/6/16.
 */
public class TestPriority {

    @Test(priority=0)
    public void fun1() {
        System.out.println("1. fun1  第一个执行；");
    }

    @Test(priority=2)
    public void fun2() {
        System.out.println("2. fun2  第二个执行；");
    }

    @Test(priority=4)
    public void fun4() {
        System.out.println("4. fun4  第四个执行；");
    }

    @Test(priority=3)
    public void fun3() {
        System.out.println("3. fun3  第三个执行；");
    }
}
