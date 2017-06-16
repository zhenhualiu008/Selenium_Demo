package scripts.testscripts.testNG;

import org.testng.annotations.Test;

/**
 * Created by lzh on 2017/6/16.
 */
public class TestEnabled {

    @Test(enabled = true)
    public void fun1() {
        System.out.println("1. fun1  的enabled属性为true，则fun1肯定执行；");
    }

    @Test(enabled = false)
    public void fun2() {
        System.out.println("2. fun2 的enabled属性为false，则fun2肯定不执行；");
    }

    @Test
    public void fun3() {
        System.out.println("3. fun3  没有对enabled进行设置，默认执行；");
    }
}
